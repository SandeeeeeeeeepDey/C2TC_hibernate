package com.cg.onemanyonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student sOne=new Student();
		Student sTwo=new Student();
		Student sThree=new Student();
		
		sOne.setName("San");
		sOne.setHomeTown("San Francisco");
		
		sTwo.setName("Deep");
		sTwo.setHomeTown("Deep River");
		
		sThree.setName("Dey");
		sThree.setHomeTown("Denmark");
		
		Department dept=new Department();
		Department deptTwo=new Department();
		
		dept.setDepartment_Id(1);;
		dept.setDeptName("Controversial");
		
		deptTwo.setDepartment_Id(2);
		deptTwo.setDeptName("Wholistics");
		
		//sOne.setDepartment(dept);
		
		dept.addStudentsInDept(sThree);
		dept.addStudentsInDept(sTwo);
		
		deptTwo.addStudentsInDept(sOne);
		
		em.persist(dept);
		em.persist(deptTwo);
		
		em.getTransaction().commit();
		
		System.out.println("Success");
		em.close();
		factory.close();

	}

}
