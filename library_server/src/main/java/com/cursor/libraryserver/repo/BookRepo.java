package com.cursor.libraryserver.repo;

import com.cursor.libraryserver.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Long> {

    List<Book> findByGenre(String genre);
    List<Book> findByAuthor(long authorId);

}
