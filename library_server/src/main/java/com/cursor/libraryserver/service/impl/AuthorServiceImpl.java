package com.cursor.libraryserver.service.impl;

import com.cursor.libraryserver.model.Author;
import com.cursor.libraryserver.repo.AuthorRepo;
import com.cursor.libraryserver.repo.BookRepo;
import com.cursor.libraryserver.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public void deleteAuthor(long authorId) {
        authorRepo.deleteById(authorId);
    }

    @Override
    public Author updateAuthor(long oldAuthorId, Author author) {
        if (authorRepo.existsById(oldAuthorId)) {
            authorRepo.deleteById(oldAuthorId);
            Author newAuthor = new Author();
            newAuthor.setId(oldAuthorId);
            newAuthor.setFName(author.getFName());
            newAuthor.setLName(author.getLName());
            newAuthor.setBooks(author.getBooks());
            return authorRepo.save(newAuthor);
        } else {
            return authorRepo.save(author);
        }
    }

}
