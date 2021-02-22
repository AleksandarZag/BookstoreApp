package com.example.bookstore.Brcko.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.bookstore.Brcko.domain.Book;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);

}
