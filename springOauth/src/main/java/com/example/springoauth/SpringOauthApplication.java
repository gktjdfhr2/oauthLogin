package com.example.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class SpringOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauthApplication.class, args);
    }

}
