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
// This table will list the data of vehicle owners.
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // To set serialNumber as auto increment type
	private int serialNumber;
	private String ownerName;
	private int licenseValidUpto;
	private String papersNeeded;
	
	// Getters and Setters
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getLicenseValidUpto() {
		return licenseValidUpto;
	}
	public void setLicenseValidUpto(int licenseValidUpto) {
		this.licenseValidUpto = licenseValidUpto;
	}
	public String getPapersNeeded() {
		return papersNeeded;
	}
	public void setPapersNeeded(String papersNeeded) {
		this.papersNeeded = papersNeeded;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	
}
