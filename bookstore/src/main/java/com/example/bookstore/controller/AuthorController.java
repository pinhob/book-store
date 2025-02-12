package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AuthorController {
    @GetMapping("/author")
    public String getAuthors() {
        return "Author controller";
    }
    

    @PostMapping("/author")
    public String createAuthor(@RequestBody String author) {
        //TODO: process POST request
        
        return author;
    }
        
}
