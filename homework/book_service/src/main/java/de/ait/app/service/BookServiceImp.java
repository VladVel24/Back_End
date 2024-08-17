package de.ait.app.service;

import de.ait.app.entity.Book;
import de.ait.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImp implements BookService {
    private final BookRepository repository;

    @Autowired
    public BookServiceImp(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return repository.findAll()
                .stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public Book save(Book book) {
        return null;
    }
}
