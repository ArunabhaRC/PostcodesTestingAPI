package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class JacksonFileReader {

    private PostcodesPOJO postcodesPOJO;
    private HttpURLConnection httpURLConnection;

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

    public HttpURLConnection readAPIHeaders(String link) {
        try {
            URL url = new URL(link);
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpURLConnection;
    }
}