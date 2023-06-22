package com.cg.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static {
		factory=Persistence.createEntityManagerFactory("JPA-PU"); // EntityManagerFactory with Persistence configuration
	}
	
	public static EntityManager getEntityManager() {
		
		if(entityManager==null|| !entityManager.isOpen()) 
			entityManager=factory.createEntityManager(); //EntityManager from EntityManagerFactory
		
		return entityManager;
	}
}
