package com.cg.dao;

import com.cg.entity.Student;

public interface StudentDao {
	void addStudent(Student student);
	Student getStudentByID(int id);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
