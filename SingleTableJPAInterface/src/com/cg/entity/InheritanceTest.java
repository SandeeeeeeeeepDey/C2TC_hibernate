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
		vehicle.setOwnerName("Personesh");
		vehicle.setPapersNeeded("License, Registration, Insurance");
		vehicle.setLicenseValidUpto(2030);
		em.persist(vehicle); // Creating reference from object in db
		
		Bike bike=new Bike(); // setting values for Bike
		bike.setOwnerName("Someonesh");
		bike.setPapersNeeded("License, Registration, Insurance");
		bike.setLicenseValidUpto(2040);
		bike.setHelmet("Yes");
		bike.eligibilityTest();
		em.persist(bike); // Creating reference from object in db
		
		Bike bikeTwo=new Bike(); // setting values for Bike
		bikeTwo.setOwnerName("Someonelsesh");
		bikeTwo.setPapersNeeded("License, Registration");
		bikeTwo.setLicenseValidUpto(2024);
		bikeTwo.setHelmet("Yes");
		bikeTwo.eligibilityTest();
		em.persist(bikeTwo); // Creating reference from object in db
		
		
		em.getTransaction().commit(); // Committing the transaction
		
		System.out.println("Transaction successful"); // To check is JPA is working correctly
		
		em.close(); // close EntityManager
		factory.close(); // close EntityManagerFactory

	}

}
