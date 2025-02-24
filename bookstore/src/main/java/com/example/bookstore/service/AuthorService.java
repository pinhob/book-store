package com.example.bookstore.service;

import org.springframework.stereotype.Service;

import com.example.bookstore.dto.AuthorDTO;
import com.example.bookstore.repository.AuthorRepository;

@Service
public class AuthorService {
    private AuthorRepository repository;

    public AuthorDTO createAuthor(AuthorDTO author) {
        return repository.createAuthor(author);
    }
}