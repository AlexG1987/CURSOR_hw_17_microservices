package com.cursor.authorservice.controller;

import com.cursor.authorservice.dto.LibraryFeighClientAuthor;
import com.cursor.authorservice.model.Author;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthorServiceController {

    @Autowired
    private LibraryFeighClientAuthor libraryFeighClientAuthor;

    @GetMapping("/find_author/{authorID}")
    public Author findAuthor(@PathVariable("authorID") Integer authorID){
        return libraryFeighClientAuthor.findAuthor(authorID);
    }

}
