package com.cg.entity;
import javax.persistence.Entity;


@Entity
public class Bike extends Vehicle {
	private String extra;

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	
	
}
