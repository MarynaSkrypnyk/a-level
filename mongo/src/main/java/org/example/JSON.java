package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
    public static void main(String[] args) {
        Human human = new Human("Antony",45,"NY");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(human);
            System.out.println(jsonString);

            Human human1 = objectMapper.readValue(jsonString, Human.class);
            System.out.println(human1);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
