package com.cursor.libraryserver.service;

import com.cursor.libraryserver.model.Author;
import com.cursor.libraryserver.model.Book;

import java.util.List;

public interface LibraryService {

    void addAuthor(Author author);

    void deleteAuthor(long authorId);

    void addBook(Book book);

    void deleteBook(long id);

    List<Book> getBooksByGenre(String genre);

    List<Book> getBooksByAuthor(long authorId);

    void updateBook(long oldBookId, Book book);

    void updateAuthor(long oldAuthorId, Author author);
}
