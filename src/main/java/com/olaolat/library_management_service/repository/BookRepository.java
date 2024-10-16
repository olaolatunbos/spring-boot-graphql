package com.olaolat.library_management_service.repository;
import com.olaolat.library_management_service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}

