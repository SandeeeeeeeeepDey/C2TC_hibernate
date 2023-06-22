package com.cg.client;

import com.cg.entity.Book;
import com.cg.service.Service;
import com.cg.service.ServiceImple;

import java.util.List;
import java.util.Scanner;

public class Client {
private static String[] s;
	private static Book book;
	private static Service service;
	
	public static void main(String[] args) {
	book= new Book();
	service= new ServiceImple();
	Scanner sc=new Scanner(System.in);
	System.out.println("Which task do you want to perform?\n1: GetBookById\r\n"
			+ "2: GetBookCount\n"
			+ "3: GetBookByTitle\n"
			+ "4: GetBookByAuthor\n"
			+ "5: GetAllBooks\n"
			+ "6: GetBookInPriceRange");
	
	int task=sc.nextInt();
	sc.nextLine();
	
	switch(task) {
	case 1:{
		System.out.println("========================================================================================================");
		System.out.println("Enter an ID Number");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println(service.getBookById(id));
		System.out.println("========================================================================================================");
		main(s);
	}
	case 2:{
		System.out.println("========================================================================================================");
		System.out.println("Total number Books we have till now are:");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println(service.getBookCount());
		System.out.println("========================================================================================================");
		main(s);
	}
	case 3:{
		System.out.println("========================================================================================================");
		System.out.println("Search by Title: \nEnter the title name, or a part of it.");
		String title=sc.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		service.getBookByTitle(title).forEach(System.out::println);
		System.out.println("========================================================================================================");
		main(s);
	}
	case 4:{
		System.out.println("========================================================================================================");
		System.out.println("Search by Author: \nEnter the Author name, or a part of it.");
		String author=sc.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		service.getBookByAuthor(author).forEach(System.out::println);
		System.out.println("========================================================================================================");
		main(s);
	}
	case 5:{
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Books we have till now are:");
		service.getAllBooks().forEach(b->{System.out.println(b);});
		System.out.println("--------------------------------------------------------------------------------------------------------");
		main(s);
	}
	case 6:{
		System.out.println("========================================================================================================");
		System.out.println("Enter the Lower range of price");
		double from=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Highest range of price");
		double to=sc.nextDouble();
		sc.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Books we have from price range "+from+"-"+to+" :\n");
		service.getBookInPriceRange(from, to).forEach(b->{System.out.println(b);});
		System.out.println("========================================================================================================");
		main(s);
	}
	default:System.out.println("Choose a valid option please.");
	main(s);
	}
	
	

	}

}
