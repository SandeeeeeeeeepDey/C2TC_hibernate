package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		@Id
		private int StudentID;
		private String name;
	
		public int getStudentID() {
			return StudentID;
		}
		public void setStudentID(int studentID) {
			StudentID = studentID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

}
