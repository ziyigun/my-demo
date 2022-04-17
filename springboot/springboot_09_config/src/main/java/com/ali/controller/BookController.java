package com.ali.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {


    @GetMapping()
    public String getById(){
        System.out.println("hot deploy");
        System.out.println("hot deploy.....1");
        System.out.println("hot deploy.....2");
        System.out.println("hot deploy.....33333");
        System.out.println("SpringBoot is running...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "SpringBoot is running ... ";
    }
}
