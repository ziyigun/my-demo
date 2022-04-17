package com.ali;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@SpringBootApplication
public class Springboot05MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05MybatisApplication.class, args);
    }

}
