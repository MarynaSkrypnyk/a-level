package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public final class MongoClients {
    public static MongoClient getCreate (){
        MongoClient mongoClient = com.mongodb.client.MongoClients.create("mongodb://mstareva:123456789@localhost:27017");

        return mongoClient;
    }
    }

