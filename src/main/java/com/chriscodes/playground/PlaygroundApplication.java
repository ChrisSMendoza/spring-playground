package com.chriscodes.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class PlaygroundApplication {
    
    @Bean // same instance needed in app and testing
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    public static void main(String[] args) {

            SpringApplication.run(PlaygroundApplication.class, args);
    }
}
