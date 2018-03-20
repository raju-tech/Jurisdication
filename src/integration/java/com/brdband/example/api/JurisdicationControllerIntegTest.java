package com.brdband.example.api;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.models.ResponseMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JurisdicatApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JurisdicationControllerIntegTest {
/*
    Test Cases:
    1. Testing the Status Code
    2. Testing the Consuming Media Type
    2. Testing the Producing Media Type
    4. Testing the JSON Payload
    5.

 */

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    public void testDemo() {
        assertTrue("*******************************Running Integration Test", true);
    }

    @Test
    public void testForResonseCodeOK() {

        ResponseEntity<ResponseMessage> response = restTemplate.
                getForEntity("http://localhost:9002/getCircleById?circleId=1", ResponseMessage.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }


}
