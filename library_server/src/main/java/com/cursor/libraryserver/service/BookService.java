package com.cursor.libraryserver.service;

import com.cursor.libraryserver.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void deleteBook(long id);

    List<Book> getBooksByGenre(String genre);

    List<Book> getBooksByAuthor(long authorId);

    Book updateBook(long oldBookId, Book book);

}
