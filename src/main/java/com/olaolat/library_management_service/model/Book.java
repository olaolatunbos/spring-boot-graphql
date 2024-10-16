package com.olaolat.library_management_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private String isbn;
    private int totalPages;
    private int availableCopies;
    private String category;

    public Book(String name, String author, String isbn, int totalPages, int availableCopies, String category) {
        this.name = name;
        this.author = author;
        this.totalPages = totalPages;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
        this.category = category;

    }
}
