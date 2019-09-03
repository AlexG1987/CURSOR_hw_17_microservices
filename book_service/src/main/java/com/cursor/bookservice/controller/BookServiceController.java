package com.cursor.bookservice.controller;

import com.cursor.bookservice.dto.LibraryFeighClientBook;
import com.cursor.bookservice.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookServiceController {

    @Autowired
    private LibraryFeighClientBook libraryFeighClientBook;

    @GetMapping("/find_book/{ID}")
    public Book findBookById(@PathVariable("ID") Integer bookId){
        return libraryFeighClientBook.findBookById(bookId);
    }

}
