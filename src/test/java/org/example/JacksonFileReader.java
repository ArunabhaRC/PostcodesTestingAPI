package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JacksonFileReader {

    private PostcodesPOJO postcodesPOJO;

    public PostcodesPOJO readPostcodesasJSON(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        new PostcodesPOJO();
        try {
            postcodesPOJO = objectMapper.readValue(new URL(path), PostcodesPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return postcodesPOJO;
    }
}