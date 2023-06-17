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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) // Will create Discrimination type "DTYPE" to differentiate
@DiscriminatorColumn(name="Vehicle_Type",discriminatorType=DiscriminatorType.STRING) // (Optional) user defined DTYPE column
@DiscriminatorValue(value="VEHICLE") // (Optional) user defined name of row. Default is class name
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
