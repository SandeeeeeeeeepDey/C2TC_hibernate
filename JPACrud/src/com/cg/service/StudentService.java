package com.cg.service;

import com.cg.entity.Student;

public interface StudentService {
	void addStudent(Student student);
	Student getStudentByID(int id);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
