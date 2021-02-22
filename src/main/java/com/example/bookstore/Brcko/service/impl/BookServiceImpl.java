package com.example.bookstore.Brcko.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.bookstore.Brcko.domain.Book;
import com.example.bookstore.Brcko.repository.BookRepository;
import com.example.bookstore.Brcko.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll() {

		List <Book> bookList=(List<Book>) bookRepository.findAll();
		List <Book> activeBookList = new ArrayList<>();
		for(Book book : bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}
		return activeBookList;

	}
	
	public Book findOne(Long id) {
		return bookRepository.findById(id).get();
	}

	public List <Book> findByCategory(String category) {
		{
			List <Book> bookList = bookRepository.findByCategory(category);

			List <Book> activeBookList = new ArrayList<>();

			for(Book book : bookList) {
				if(book.isActive()) {
					activeBookList.add(book);
				}
			}
			return activeBookList;
		}
	}

	public List <Book> blurrySearch(String title){
		List <Book> bookList = bookRepository.findByTitleContaining(title);
		List <Book> activeBookList = new ArrayList<>();

		for(Book book : bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}
}
