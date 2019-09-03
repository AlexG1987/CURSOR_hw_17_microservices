package com.cursor.libraryserver.repo;

import com.cursor.libraryserver.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
