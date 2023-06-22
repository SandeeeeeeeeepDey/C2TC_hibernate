package com.cg.dao;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.util.List;

import com.cg.entity.Book;

public class BookDaoImple implements BookDao {
	private EntityManager em;
	public BookDaoImple() {
		em=JPAUtil.getEntityManager();
	}
	
	@Override
	public Book getBookById(int id) {
		// Find a specific book using Id
		Book b=em.find(Book.class, id);
		return b;
	}
	@Override
	public Long getBookCount() {
		// Find number of books in Database
		String jpql="SELECT COUNT(b.id) FROM Book b";
		TypedQuery<Long> query=em.createQuery(jpql, Long.class);
		Long result=query.getSingleResult();
		return result;
	}
	@Override
	public List<Book> getBookByTitle(String title) {
		// Find book by part of title
		String jpql="SELECT b FROM Book b WHERE b.title LIKE: pTitle";
		TypedQuery<Book> query=em.createQuery(jpql,Book.class);
		query.setParameter("pTitle", "%"+title+"%");
		List<Book> result=query.getResultList();
		return result;
	}
	@Override
	public List<Book> getBookByAuthor(String auth) {
		// Find book by part of Author
		String jpql="SELECT b FROM Book b WHERE b.author LIKE: pAuthor";
		TypedQuery<Book> query= em.createQuery(jpql,Book.class);
		query.setParameter("pAuthor", "%"+auth+"%");
		List<Book> result=query.getResultList();
		return result;
	}
	@Override
	public List<Book> getAllBooks() {
		// return all books
		TypedQuery<Book> query= em.createNamedQuery("findAll", Book.class); // using Named Query
		return query.getResultList();
	}
	@Override
	public List<Book> getBookInPriceRange(double from, double to) {
		// Find book in cost range
		String jpql= "SELECT b FROM Book b WHERE b.price BETWEEN :low AND :high";
		TypedQuery<Book> query= em.createQuery(jpql,Book.class);
		query.setParameter("low", from);
		query.setParameter("high", to);
		return query.getResultList();
	}
	

	
}
