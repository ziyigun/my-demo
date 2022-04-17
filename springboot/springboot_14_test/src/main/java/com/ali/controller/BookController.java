package com.ali.controller;

import com.ali.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public Book getById(){
        System.out.println("getById is running....");
        Book book = new Book();
        book.setId(1);
        book.setName("springboot_name");
        book.setType("springboot_type");
        book.setDescription("springboot_des");
        return book;
    }
}
