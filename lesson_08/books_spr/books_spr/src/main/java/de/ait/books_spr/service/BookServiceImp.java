package de.ait.books_spr.service;

import de.ait.books_spr.entity.Book;
import de.ait.books_spr.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class BookServiceImp implements BookService {
    private final BookRepository repository;

    @Autowired
    public BookServiceImp(BookRepository repository) {
        this.repository = repository;
    }



    public List<Book> findAll() {
        return repository.findAll();
    }
    @Override
    public List<Book> getBooks(String title, String author) {

        Predicate<Book> predicateByTitle = (title.equals("")) ? b -> true : b -> b.getTitle().equalsIgnoreCase(title);
        Predicate<Book> predicateByAuthor = (author.equals("")) ? b -> true : b -> b.getTitle().equalsIgnoreCase(author);

        Predicate<Book> allConditions = predicateByTitle.and(predicateByAuthor);

        return repository.findAll()
                .stream()
                .filter(allConditions)
                .toList();
    }

    @Override
    public Book findById(Long id) {
        return findAll()
                .stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    @Override
    public Book create(Book book) {
        if (book.getId() != null) {
            book.setId(null);
        }
        return repository.save(book);
    }

@Override
    public List<Book> findByAuthor(String author) {
        return findAll()
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }


}
