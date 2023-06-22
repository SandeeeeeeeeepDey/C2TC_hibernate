package com.cg.dao;

import com.cg.entity.Book;

import java.util.List;

public interface BookDao {
	
	Book getBookById(int id);
	Long getBookCount();
	List<Book> getBookByTitle(String title);
	List<Book> getBookByAuthor(String auth);
	List<Book> getAllBooks();
	List<Book> getBookInPriceRange(double from, double to );
	
	
}
