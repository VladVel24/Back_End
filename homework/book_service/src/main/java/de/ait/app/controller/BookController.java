package de.ait.app.controller;

import de.ait.app.entity.Book;
import de.ait.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookController {
    private final BookService service;

@Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
    public Book getBookById(Long id) {
        return service.getBookById(id);
    }


}
