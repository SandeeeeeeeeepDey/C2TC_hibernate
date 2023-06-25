package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="plane")
public class Plane extends Vehicle {
// Table to store data of Pilots and their eligibility.
	
	private static final long serialVersionUID = 1L;
	private String helmet;
	private boolean suite;
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
		String req[]= {"License", "Registration", "Insurance", "Pilot's License"};
		String has[]=this.getPapersNeeded().split(", ");

		boolean papers=true;
		
		if(has.length!=req.length) papers=false;
		else
			for(int i=0;i<req.length;i++)
				if(!req[i].toLowerCase().equals(has[i].toLowerCase())) papers=false;
		
		if(this.helmet.toLowerCase().equals("yes") && this.getLicenseValidUpto()>2023 && papers ) {
			setEligibility(true);
		}
		else setEligibility(false);
		
	}

	public boolean hasSuite() {
		return suite;
	}

	public void setSuite(boolean suite) {
		this.suite = suite;
	}

	

	
	
}