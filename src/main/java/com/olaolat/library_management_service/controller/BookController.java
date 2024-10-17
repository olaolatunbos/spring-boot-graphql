package com.olaolat.library_management_service.controller;

import com.olaolat.library_management_service.model.Book;
import com.olaolat.library_management_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;
import java.util.Map;

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

    @MutationMapping
    public Book updateStock(@Argument int id, @Argument int availableCopies) {
        return service.updateAvailableCopies(id, availableCopies);

    }


}

