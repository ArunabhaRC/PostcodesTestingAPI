package org.example;

import java.net.HttpURLConnection;

public class HeaderDTO {

    private HttpURLConnection httpURLConnection;

    public HeaderDTO(String link) {
        JacksonFileReader fileReader = new JacksonFileReader();
        httpURLConnection = fileReader.readAPIHeaders(link);
    }

    public String getServer() {
        return httpURLConnection.getHeaderField("Server");
    }

    public String getDayDateTime() {
        return httpURLConnection.getHeaderField("Date");
    }

    public String getContentType() {
        return httpURLConnection.getHeaderField("Content-Type");
    }

    public String getContentlength() {
        return httpURLConnection.getHeaderField("Content-Length");
    }

    public String getConnection() {
        return httpURLConnection.getHeaderField("Connection");
    }

    public String getXGNU() {
        return httpURLConnection.getHeaderField("X-GNU");
    }

    public String getAccessControlAllowOrigin() {
        return httpURLConnection.getHeaderField("Access-Control-Allow-Origin");
    }

    public String getETag() {
        return httpURLConnection.getHeaderField("Etag");
    }
}