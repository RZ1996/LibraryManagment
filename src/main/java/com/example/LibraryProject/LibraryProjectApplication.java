package com.example.LibraryProject;

import com.example.LibraryProject.entity.Author;
import com.example.LibraryProject.entity.Book;
import com.example.LibraryProject.entity.Category;
import com.example.LibraryProject.entity.Publisher;
import com.example.LibraryProject.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {
			Book book1 = new Book("ABC1", "Book name", "My first book");
			Author author1 = new Author("Test name", "Test description");
			Category category1 = new Category("Actions books");
			Publisher publisher1 = new Publisher("First publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("ABC2", "Book name", "My second book");
			Author author2 = new Author("Test name2", "Test description2");
			Category category2 = new Category("Science books");
			Publisher publisher2 = new Publisher("Second publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);

			Book book3 = new Book("ABC3", "Book name", "My third book");
			Author author3 = new Author("Test name3", "Test description3");
			Category category3 = new Category("Romance books");
			Publisher publisher3 = new Publisher("Third publisher");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookService.createBook(book3);

		};

	}
}
