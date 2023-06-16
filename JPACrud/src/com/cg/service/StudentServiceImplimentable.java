package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpli;
import com.cg.entity.Student;

public class StudentServiceImplimentable implements StudentService {
	
	private StudentDao dao;
	
	public StudentServiceImplimentable() {
		
		dao=new StudentDaoImpli(); // to use Entity manager

	}

	@Override
	public void addStudent(Student student) {
		// Persistent for CREATE
		dao.beginTrasaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student getStudentByID(int id) {
		// Find to RETRIEVE
		Student student= dao.getStudentByID(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// Merge to UPDATE
		dao.beginTrasaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteStudent(Student student) {
		// Remove to DELETE
		dao.beginTrasaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		
	}



}
