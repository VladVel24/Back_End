package de.ait.app.repository;

import de.ait.app.entity.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;


@Component
public class BookRepositoryImp implements BookRepository {
    List<Book> books = List.of(
            new Book(1L, "The Three Musketeers", "Dumas A", new BigDecimal("5.9")),
            new Book(2L, "The Viconte of Bragelonne", "Dumas A", new BigDecimal("5.0")),
            new Book(3L, "The Man in the Iron Mask", "Dumas A", new BigDecimal("4.9")),
            new Book(4L, "The Black Tulip", "Dumas A", new BigDecimal("5.4")),
            new Book(5L, "The Count of Monte Cristo", "Dumas A", new BigDecimal("6.3"))
    );

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book delete(Book book) {
        return null;
    }
}
