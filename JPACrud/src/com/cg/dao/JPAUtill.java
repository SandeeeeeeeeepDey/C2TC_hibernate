package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtill {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static {
		factory=Persistence.createEntityManagerFactory("JPA-PU"); // Create Entity Manager Factory from Persistence.xml 
	}
	
	public static EntityManager getEntityManager() {
		
		if(manager==null || !manager.isOpen()) // Check is Entity Manager is already open or is absent.
			manager=factory.createEntityManager(); // Create Entity Manager
		
		return manager;
	}
}
