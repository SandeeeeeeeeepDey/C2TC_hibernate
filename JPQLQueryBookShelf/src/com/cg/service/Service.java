package com.cg.service;

import java.util.List;

import com.cg.entity.Book;

public interface Service {
	
	Book getBookById(int id);
	Long getBookCount();
	List<Book> getBookByTitle(String title);
	List<Book> getBookByAuthor(String auth);
	List<Book> getAllBooks();
	List<Book> getBookInPriceRange(double from, double to );
	
	
}
