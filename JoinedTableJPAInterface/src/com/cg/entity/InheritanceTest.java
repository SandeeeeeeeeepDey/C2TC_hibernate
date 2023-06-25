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

		
		SpaceShip spaceShip=new SpaceShip(); // setting values for SpaceShip
		spaceShip.setOwnerName("Someonesh");
		spaceShip.setPapersNeeded("License, Registration, Beetle's Fanclub Membership, Astraunaut's License");
		spaceShip.setLicenseValidUpto(2040);
		spaceShip.setSpaceSuite("Yes");
		spaceShip.setSpoksPermission(true);
		spaceShip.eligibilityTest();
		em.persist(spaceShip); // Creating reference from object in db
		
		SpaceShip spaceShipTwo=new SpaceShip(); // setting values for SpaceShip
		spaceShipTwo.setOwnerName("Someonelsesh");
		spaceShipTwo.setPapersNeeded("License, Registration, Beetle's Fanclub Membership, Astraunaut's License");
		spaceShipTwo.setLicenseValidUpto(2024);
		spaceShipTwo.setSpaceSuite("Yes");
		spaceShipTwo.setSpoksPermission(false);
		spaceShipTwo.eligibilityTest();
		em.persist(spaceShipTwo); // Creating reference from object in db
		
		em.getTransaction().commit(); // Committing the transaction
		
		System.out.println("Transaction successful"); // To check is JPA is working correctly
		
		em.close(); // close EntityManager
		factory.close(); // close EntityManagerFactory

	}

}
