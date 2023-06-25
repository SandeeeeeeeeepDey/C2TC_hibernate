package com.cg.entity;

import java.util.Arrays;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="BIKE") // user defined name of row.
public class Bike extends Vehicle {
// This table will list the data of bike owners and state if they are eligible to ride or not. 
	
	private static final long serialVersionUID = 1L;
	private String helmet;
	private boolean eligibility;

	public String getHelmet() {
		return helmet;
	}

	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}

	public boolean isEligibility() {
		return eligibility;
	}

	public void setEligibility(boolean eligibility) {
		this.eligibility = eligibility;
	}


	public void eligibilityTest() {
		String req[]= {"License", "Registration", "Insurance"};
		String has[]=this.getPapersNeeded().split(", ");
		System.out.println(Arrays.toString(has));
		boolean papers=true;
		if(has.length!=req.length) papers=false;
		else {
			for(int i=0;i<req.length;i++) {
				if(!req[i].toLowerCase().equals(has[i].toLowerCase())) papers=false;
			}
		}
		System.out.println(papers);
		
		if(this.helmet.toLowerCase().equals("yes") && this.getLicenseValidUpto()>2023 && papers ) {
			setEligibility(true);
		}
		else setEligibility(false);
		
	}

	

	
	
}
