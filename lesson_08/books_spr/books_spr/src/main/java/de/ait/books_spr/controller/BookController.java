package de.ait.books_spr.controller;

import de.ait.books_spr.entity.Book;
import de.ait.books_spr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.List;


@RestController
@RequestMapping("/api")
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }
    @GetMapping("/books")
    public List<Book> getBooks(@RequestParam(name = "t", required = false, defaultValue = "") String title,
                               @RequestParam(name = "a", required = false, defaultValue = "") String author){

        return service.getBooks(title, author);
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return service.create(book);
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable(name = "id") Long id){
        return service.findById(id);
    }



}







