package de.ait.books_spr.service;

import de.ait.books_spr.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks(String title, String author);
    //List<Book> findAll();
    Book findById(Long id);
    Book create(Book book);
    List<Book> findByAuthor(String author);

}
