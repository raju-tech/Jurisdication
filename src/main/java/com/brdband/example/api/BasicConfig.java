package com.brdband.example.api;

import com.brdband.example.api.services.JurisdicationService;
import com.brdband.example.api.services.JurisdicationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfig {

    @Bean(value = "jurisdicationServiceImpl")
    public JurisdicationService loadJurisdicationService(){
        return new JurisdicationServiceImpl();
    }

}
