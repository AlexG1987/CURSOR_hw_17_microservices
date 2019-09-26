package com.cursor.libraryserver.controller;

import com.cursor.libraryserver.model.Book;
import com.cursor.libraryserver.service.impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("book")
public class BookController {

    @Autowired
    final BookServiceImpl BookService;

    @PostMapping("/")
    public ResponseEntity addBook(@RequestBody Book book) {
        BookService.addBook(book);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("/author/{id}")
    public List<Book> sortedBooksByAuthor(@PathVariable("id") long id) {
        return BookService.getBooksByAuthor(id);
    }

    @GetMapping("/genre/{genre}")
    public List<Book> sortedBooksByGenre(@PathVariable("genre") String genre) {
        return BookService.getBooksByGenre(genre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable("id") long bookId) {
        BookService.deleteBook(bookId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBook(@PathVariable("id") int oldBookId, @RequestBody Book book) {
        BookService.updateBook(oldBookId, book);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
