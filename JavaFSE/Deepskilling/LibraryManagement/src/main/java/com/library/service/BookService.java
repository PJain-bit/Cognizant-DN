package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Exercise 2 requirement: Setter method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void runService() {
        System.out.println("BookService: Delegating task to Repository...");
        bookRepository.executeRepositoryAction();
    }
}
