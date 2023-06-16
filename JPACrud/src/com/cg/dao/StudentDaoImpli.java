package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpli implements StudentDao {
	
	private EntityManager manager;
	private Student student;
	
	public StudentDaoImpli() {
		manager= JPAUtill.getEntityManager(); 
	}

	@Override
	public void addStudent(Student student) {
		// Persistent for CREATE
		manager.persist(student);
		
	}

	@Override
	public Student getStudentByID(int id) {
		// Find to RETRIEVE
		student=manager.find(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// Merge to UPDATE
		manager.merge(student);
		
	}

	@Override
	public void deleteStudent(Student student) {
		// Remove to DELETE
		manager.remove(student);
	}

	@Override
	public void beginTrasaction() {
		// To Begin the transaction 
		manager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		// If allowed, it will commit the transaction.
		manager.getTransaction().commit();
		
	}
	
}
