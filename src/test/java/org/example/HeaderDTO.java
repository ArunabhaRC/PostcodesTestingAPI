package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HeaderDTO {

    private HttpURLConnection httpURLConnection;

    public HeaderDTO(String link){
        JacksonFileReader fileReader = new JacksonFileReader();
        httpURLConnection = fileReader.readAPIHeaders(link);
    }


    public String getServer(){
        return httpURLConnection.getHeaderField("Server");
    }

    public String getDayDateTime(){
        return httpURLConnection.getHeaderField("Date");
    }




}
