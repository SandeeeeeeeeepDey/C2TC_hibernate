package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpli;
import com.cg.entity.Student;

public class StudentServiceImplimentable implements StudentService {
	
	private StudentDao dao;
	
	public StudentServiceImplimentable() {
		
		dao=new StudentDaoImpli();

	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTrasaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student getStudentByID(int id) {
		// TODO Auto-generated method stub
		Student student= dao.getStudentByID(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTrasaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTrasaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		
	}



}
