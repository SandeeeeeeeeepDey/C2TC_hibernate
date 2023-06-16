package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // To notify that this is an Entity
@Table(name="student") // to name the Table 
public class Student implements Serializable { // to persist an object to reference type, entities must implement Serializable Interface.
	
	private static final long serialVersionUID = 1L;
	
		@Id // to notify that the following property is the identity and needs to be unique
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
