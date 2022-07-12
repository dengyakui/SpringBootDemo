package com.quintos.springdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        return "It works";
    }


    @PostMapping
    public String Create(){
        return "Post works";
    }

    @PutMapping
    public String Update(){
        return "Put works";
    }

    @DeleteMapping
    public String Delete(){
        return "Delete works";
    }
}
