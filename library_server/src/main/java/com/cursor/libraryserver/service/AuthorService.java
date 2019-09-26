package com.cursor.libraryserver.service;

import com.cursor.libraryserver.model.Author;

public interface AuthorService {

    void addAuthor(Author author);

    void deleteAuthor(long authorId);

    Author updateAuthor(long oldAuthorId, Author author);
}
