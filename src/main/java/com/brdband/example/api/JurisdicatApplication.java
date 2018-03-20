package com.brdband.example.api;

import com.brdband.example.api.services.JurisdicationService;
import com.brdband.example.api.services.JurisdicationServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.brdband.example.api")
public class JurisdicatApplication {

    public static void main(String[] args) {
        SpringApplication.run(JurisdicatApplication.class, args);
    }


}
