package com.cg.onemanyonebidirectional;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int department_Id;
	private String deptName;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private Set<Student> students= new HashSet<>();
	
	

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addStudentsInDept(Student student) {
		student.setDepartment(this);
		this.getStudents().add(student);
	}
}
