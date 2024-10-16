package com.olaolat.library_management_service.controller;

import com.olaolat.library_management_service.model.Book;
import com.olaolat.library_management_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @QueryMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @QueryMapping
    public List<Book> getBooksByCategory(@Argument String category) {
        return service.getBooksByCategory(category);
    }


}

