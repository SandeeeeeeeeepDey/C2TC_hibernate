package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU"); // EntityManagerFactory from Persistence
		EntityManager em=factory.createEntityManager(); // EntityManager from factory
		
		em.getTransaction().begin(); // Begin transaction
		
		Student student=new Student();
		student.setName("Sherlock"); // We set student exclusive information
		
		Address address=new Address(); // Then we set address info for providing to student
		address.setAddress_id(1);
		address.setDoorNumber("21B");
		address.setStreet("Baker's Street");
		address.setCity("London");
		address.setState("United Kingdom");
		
		student.setAddress(address); // To add the address information to student
		
		em.persist(student); // Create the student database
		
		System.out.println("Transaction successful"); // To check is JPA is working correctly
		
		em.getTransaction().commit(); // Committing the transaction
		
		em.close(); // close EntityManager
		factory.close(); // close EntityManagerFactory

	}

}
