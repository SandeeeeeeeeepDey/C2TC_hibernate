package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bikee")
public class Bike extends Vehicle {
	private String extra;

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	
	
}
