package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.service.AuthorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AuthorController {
    private AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("/author")
    public String getAuthors() {
        return "Author controller";
    }
    
    @PostMapping("/author")
    public String createAuthor(@RequestBody String author) {
        return service.createAuthor(author);
    }
        
}
