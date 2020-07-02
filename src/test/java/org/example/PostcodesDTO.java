package org.example;

public class PostcodesDTO {
    private PostcodesPOJO postcodes;
    private Result result;
    private Codes codes;

    public PostcodesDTO(String apiURL) {
        JacksonFileReader fileReader = new JacksonFileReader();
        postcodes = fileReader.readPostcodesasJSON(apiURL);
        result = postcodes.getResult();
        codes = result.getCodes();
    }

    public Integer getStatus() {
        return postcodes.getStatus();
    }

    public String getPostcode() {
        return result.getPostcode();
    }

    public String getCountry() {
        return result.getCountry();
    }

    public String getadminDistrict() {
        return codes.getadmin_district();
    }
}