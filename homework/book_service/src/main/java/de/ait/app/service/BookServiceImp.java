package de.ait.app.service;

import de.ait.app.entity.Book;
import de.ait.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;
@Autowired
    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findAll()
                .stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }


}
