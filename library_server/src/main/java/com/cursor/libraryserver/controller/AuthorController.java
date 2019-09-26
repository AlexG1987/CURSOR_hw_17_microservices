package com.cursor.libraryserver.controller;

import com.cursor.libraryserver.model.Author;
import com.cursor.libraryserver.service.impl.AuthorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("author")
public class AuthorController {

    @Autowired
    final AuthorServiceImpl AuthorServiceImpl;

    @PostMapping("/")
    public ResponseEntity addAuthor(@RequestBody Author author) {
        AuthorServiceImpl.addAuthor(author);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAuthor(@PathVariable("id") long authorId) {
        AuthorServiceImpl.deleteAuthor(authorId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAuthor(@PathVariable("id") int oldAuthorId, @RequestBody Author author) {
        AuthorServiceImpl.updateAuthor(oldAuthorId, author);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }


}
