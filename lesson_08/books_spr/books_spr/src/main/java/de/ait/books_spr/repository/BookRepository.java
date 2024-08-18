package de.ait.books_spr.repository;


import de.ait.books_spr.entity.Book;

import java.util.List;

public interface BookRepository {
    List<de.ait.books_spr.entity.Book> findAll();
    Book save (Book book);


}
