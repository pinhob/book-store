package com.example.bookstore.repository;

import org.springframework.stereotype.Repository;

import com.example.bookstore.dto.AuthorDTO;

@Repository
public class AuthorRepository {
    public AuthorDTO createAuthor(AuthorDTO author) {
        return author; 
    }
}
