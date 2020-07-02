package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PostcodesAPITester {
    PostcodesDTO postcodesDTO = new PostcodesDTO("http://api.postcodes.io/postcodes/LA13FR");
    HeaderDTO headerDTO = new HeaderDTO("http://api.postcodes.io/postcodes/LA13FR");

    @Test
    @DisplayName("Status Code Test")
    void testingStatusCode() {
        Assertions.assertEquals(200, postcodesDTO.getStatus());
    }

    @Test
    @DisplayName("Checking Admin District is correct")
    void testingAdminDistrict() {
        Assertions.assertEquals("E07000121",postcodesDTO.getadminDistrict());
    }

    @Test
    @DisplayName("Header Test for Content type")
    void testContentTypeHeader() {
        Assertions.assertEquals("application/json; charset=utf-8", headerDTO.getContentType());
    }

    @Test
    @DisplayName("Header Test for Connection")
    void testConnection() {
        Assertions.assertEquals("keep-alive", headerDTO.getConnection());
    }

    @Test
    @DisplayName("Header Test for Access Control Allow Origin")
    void testAccessControl() {
        Assertions.assertEquals("*", headerDTO.getAccessControlAllowOrigin());
    }

    @Test
    @DisplayName("Checking if Postcode is correct")
    void testingPostcodeAccuracy() {
        Assertions.assertEquals("LA1 3FR", postcodesDTO.getPostcode());
    }

    @Test
    @DisplayName("Checking if the Country is Correct")
    void testingCountry(){
        Assertions.assertEquals("England", postcodesDTO.getCountry());
    }
}