package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU"); // EntityManagerFactory from Persistence
		EntityManager em=factory.createEntityManager(); // EntityManager from factory
		
		em.getTransaction().begin(); // Begin transaction
		
		Vehicle vehicle=new Vehicle(); // setting values for Vehicle
		vehicle.setName("Rolls-Royce");
		vehicle.setWheels(4);
		em.persist(vehicle); // Creating reference from object in db
		
		Bike bike=new Bike(); // setting values for Vehicle
		bike.setName("Harley");
		bike.setWheels(2);
		bike.setExtra("Needs helmet");
		em.persist(bike); // Creating reference from object in db
		
		System.out.println("Transaction successful"); // To check is JPA is working correctly
		
		em.getTransaction().commit(); // Committing the transaction
		
		em.close(); // close EntityManager
		factory.close(); // close EntityManagerFactory

	}

}
