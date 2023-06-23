package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int address_id;
	private String doorNumber;
	private String street;
	private String city;
	private String State;
	
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", doorNumber=" + doorNumber + ", street=" + street + ", city="
				+ city + ", State=" + State + "]";
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@OneToOne(mappedBy="address")
	private Student student;
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
