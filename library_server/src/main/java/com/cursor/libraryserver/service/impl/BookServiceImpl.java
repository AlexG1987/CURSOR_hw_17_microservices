package com.cursor.libraryserver.service.impl;

import com.cursor.libraryserver.model.Book;
import com.cursor.libraryserver.repo.AuthorRepo;
import com.cursor.libraryserver.repo.BookRepo;
import com.cursor.libraryserver.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public List<Book> getBooksByAuthor(long authorId) {
        return bookRepository.findByAuthor(authorId);
    }

    @Override
    public Book updateBook(long oldBookId, Book book) {
        if (bookRepository.existsById(oldBookId)) {
            bookRepository.deleteById(oldBookId);
            Book newBook = new Book();
            newBook.setAuthor(book.getAuthor());
            newBook.setDescription(book.getDescription());
            newBook.setGenre(book.getGenre());
            newBook.setRate(book.getRate());
            newBook.setTitle(book.getTitle());
            newBook.setId(oldBookId);
            return bookRepository.save(newBook);
        } else {
            return bookRepository.save(book);
        }
    }

}
