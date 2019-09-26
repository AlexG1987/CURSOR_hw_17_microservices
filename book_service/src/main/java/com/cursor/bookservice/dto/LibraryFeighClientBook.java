package com.cursor.bookservice.dto;

import com.cursor.bookservice.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "library-server")
public interface LibraryFeighClientBook {

    @GetMapping("/find_book/id}")
    public Book findBookById(@PathVariable("id") Integer bookId);
}
