package com.ali.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {

    @Bean
    public User getU(){
        return new User();
    }
}
