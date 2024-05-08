package org.example.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{ \"data\": { \"a\": \"213456\", \"b\": \"abcdef\", \"T\": [ { \"n_t\": \"1\", \"c_i_p\": \"abd-123\" } ], \"BATATA\": [ { \"batatinha1\": \"1\", \"batatinha2\": \"2\" } ], \"Macarrao\": [ { \"mc1\": \"1\", \"mc2\": \"2\" } ] } }";
        Root root = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            root = mapper.readValue(jsonString, Root.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        Root rt = root;
    }
}