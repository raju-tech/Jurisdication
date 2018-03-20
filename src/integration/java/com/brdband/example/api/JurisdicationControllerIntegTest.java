package com.brdband.example.api;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.repositories.JurisdicationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
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
    public void testDemo(){
              assertTrue("*******************************Running Integration Test", true);
    }






}
