package de.ait.books_spr.repository;

import de.ait.books_spr.entity.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepositoryImp implements BookRepository {


    private List<Book> database = new ArrayList<>(List.of(
            new Book(1L, "The Three Musketeers", "Dumas A", new BigDecimal("5.9")),
            new Book(2L, "The Viconte of Bragelonne", "Dumas A", new BigDecimal("5.0")),
            new Book(3L, "The Man in the Iron Mask", "Dumas A", new BigDecimal("4.9")),
            new Book(4L, "The Black Tulip", "Dumas A", new BigDecimal("5.4")),
            new Book(5L, "The Count of Monte Cristo", "Dumas A", new BigDecimal("6.3"))
    ));

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Book save(Book book) {
        if (book.getId() == null) {
            Long newId = database.get(database.size() - 1).getId() + 1;
            book.setId(newId);
            database.add(book);
        } else {
        }
        return book;
    }
}