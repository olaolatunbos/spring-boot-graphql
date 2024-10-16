package com.olaolat.library_management_service;

import com.olaolat.library_management_service.model.Book;
import com.olaolat.library_management_service.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LibraryManagementServiceApplication {

	@Autowired
	private BookRepository bookRepository;

	@PostConstruct
	public void initDB() {
		// Initialize Book Data
		List<Book> books = Stream.of(
				new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 281, 5, "Fiction"),
				new Book("1984", "George Orwell", "978-0451524935", 328, 3, "Dystopian Fiction"),
				new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 180, 4, "Fiction"),
				new Book("Pride and Prejudice", "Jane Austen", "978-1503290563", 279, 2, "Classic Fiction"),
				new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769488", 277, 6, "Fiction"),
				new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "978-0062316097", 443, 5, "Non-fiction"),
				new Book("Educated", "Tara Westover", "978-0399590504", 334, 3, "Memoir"),
				new Book("Becoming", "Michelle Obama", "978-1524763138", 448, 4, "Memoir"),
				new Book("The Immortal Life of Henrietta Lacks", "Rebecca Skloot", "978-1400052189", 381, 2, "Non-fiction"),
				new Book("The Wright Brothers", "David McCullough", "978-1476728759", 336, 6, "Biography")
		).collect(Collectors.toList());

		bookRepository.saveAll(books);
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementServiceApplication.class, args);
	}

}
