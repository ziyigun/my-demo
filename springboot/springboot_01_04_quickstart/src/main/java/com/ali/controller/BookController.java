package com.ali.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping
    public String getById(){
        System.out.println("springboot is running...4");
        return "springboot is running....4";
    }
}
