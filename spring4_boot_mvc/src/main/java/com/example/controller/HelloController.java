package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2016/12/15.
 */
@RestController
@RequestMapping("hello")
public class HelloController {


    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("")
    public String hello() {
        return "book name is: " + bookName + " and book author is:" + bookAuthor + "";
    }

}
