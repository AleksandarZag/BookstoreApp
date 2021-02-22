package com.example.bookstore.Brcko.service;

import com.example.bookstore.Brcko.domain.Book;

import java.util.ArrayList;
import java.util.List;


public interface BookService {
	List<Book> findAll ();
	
	Book findOne(Long id);

	List <Book> findByCategory(String category);
	List <Book> blurrySearch(String title);

}
