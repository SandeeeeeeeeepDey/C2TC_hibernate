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
		
		Plane plane=new Plane(); // setting values for Plane
		plane.setOwnerName("Someonesh");
		plane.setPapersNeeded("License, Registration, Insurance, Pilot's License");
		plane.setLicenseValidUpto(2040);
		plane.setHelmet("Yes");
		plane.setSuite(true);
		plane.eligibilityTest();
		em.persist(plane); // Creating reference from object in db
		
		Plane planeTwo=new Plane(); // setting values for Plane
		planeTwo.setOwnerName("Someonelsesh");
		planeTwo.setPapersNeeded("License, Registration, Insurance, Pilot's License");
		planeTwo.setLicenseValidUpto(2024);
		planeTwo.setHelmet("No");
		planeTwo.setSuite(true);
		planeTwo.eligibilityTest();
		em.persist(planeTwo); // Creating reference from object in db
		
		
		em.getTransaction().commit(); // Committing the transaction
		
		System.out.println("Transaction successful"); // To check is JPA is working correctly
		
		em.close(); // close EntityManager
		factory.close(); // close EntityManagerFactory

	}

}
