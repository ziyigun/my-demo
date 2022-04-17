package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml数据中的单一数据
    @Value("${country}")
    private String country1;

    @Value("${user.age}")
    private String name1;

    @Value("${tempDir}")
    private String tempDir1;


    @Autowired
    private Environment env;

    @RequestMapping
    public String getById(){
        System.out.println("springboot is running...");
        System.out.println("country1===>" + country1);
        System.out.println("name1===>" + name1);
        System.out.println("tempDir1===>"+tempDir1);
        System.out.println("------------------");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("user.name"));
        return "springboot is running....";
    }
}
