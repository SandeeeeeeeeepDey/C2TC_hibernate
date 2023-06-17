package com.cg.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Vehicles")
@Inheritance(strategy=InheritanceType.JOINED) // Will create one table for all entities and will create extra tables for extras for each class with property linked to id.
public class Vehicle implements Serializable{ 

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // To set serialNumber as auto increment type
	private int serialNumber;
	private int Wheels;
	private String name;
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getWheels() {
		return Wheels;
	}
	public void setWheels(int wheels) {
		Wheels = wheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
