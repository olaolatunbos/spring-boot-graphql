package com.olaolat.library_management_service.service;
import com.olaolat.library_management_service.model.Book;
import com.olaolat.library_management_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;


    public List<Book> getBooks(){
        return repository.findAll();
    }

    public List<Book> getBooksByCategory(String category){
        return repository.findAll();
    }

    public Book addBook(Book book){
        return repository.save(book);
    }

    public Book updateAvailableCopies(int id, int availableCopies){

        Book existingBook= repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Book not found with id "+id));

        existingBook.setAvailableCopies(availableCopies);
        return repository.save(existingBook);
    }

}

