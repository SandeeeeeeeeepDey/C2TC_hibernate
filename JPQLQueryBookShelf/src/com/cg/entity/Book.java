package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book")
@NamedQueries(@NamedQuery(name="findAll", query="SELECT b FROM Book b"))
public class Book implements Serializable{
	
	public static final long  serialVersionUID=1L;
	
	@Id
	private int id; // Unique Id // Since in this project we are only querying info, we dont need auto-generative ID
	private String title;
	private String author;
	private Double price;
	
	// Getters Setters
	
	public String getTitle() {
		return title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	
}
