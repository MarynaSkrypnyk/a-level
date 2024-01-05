package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.lang.runtime.ObjectMethods;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        MongoClient mongoClient = MongoClients.create("mongodb://mstareva:123456789@localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection <Document> collection = database.getCollection("human");

        Human human = new Human("Antony",45,"NY");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(human);
        Document document2 = Document.parse(json);
        collection.insertOne(document2);

        collection.updateOne(
                Filters.eq("name","Ben"),
                Updates.set("age",18)
        );

        Document document1 = new Document()
                .append("name","Olly")
                .append("age", 82)
                .append("city","JW");
        collection.insertOne(document1);

        collection.deleteOne(Filters.eq("age",82));

        FindIterable <Document> documents = collection.find();
        for (Document document: documents ){
            System.out.println(document);
        }
    }
}