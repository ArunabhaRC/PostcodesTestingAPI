package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JacksonFileReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public PostcodesPOJO readPostcodesasJSON(String path) {
        PostcodesPOJO postcodesPOJO = new PostcodesPOJO();
        try {
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            postcodesPOJO = objectMapper.readValue(new URL(path), PostcodesPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return postcodesPOJO;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

}