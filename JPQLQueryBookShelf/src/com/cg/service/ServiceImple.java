package com.cg.service;

import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImple;

import com.cg.entity.Book;

public class ServiceImple implements Service {
	
	private BookDao dao;
	public ServiceImple() {
		dao= new BookDaoImple();
	}

	@Override
	public Book getBookById(int id) {
		Book b=dao.getBookById(id);
		return b;
	}

	@Override
	public Long getBookCount() {
		Long l=dao.getBookCount();
		return l;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		List<Book> l=dao.getBookByTitle(title);
		return l;
	}

	@Override
	public List<Book> getBookByAuthor(String auth) {
		List<Book> l=dao.getBookByAuthor(auth);
		return l;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> l=dao.getAllBooks();
		return l;
	}

	@Override
	public List<Book> getBookInPriceRange(double from, double to) {
		List<Book> l=dao.getBookInPriceRange(from, to);
		return l;
	}
	
	

}
