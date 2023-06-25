package com.cg.entity;
import javax.persistence.Entity;


@Entity
public class SpaceShip extends Vehicle {
// Table to store data of Spaceship drivers and their eligibility.
	
	private static final long serialVersionUID = 1L;
	private String spaceSuite;
	private boolean spoksPermission;
	private String eligibility;

	


	public String getSpaceSuite() {
		return spaceSuite;
	}




	public void setSpaceSuite(String spaceSuite) {
		this.spaceSuite = spaceSuite;
	}




	public boolean isSpoksPermission() {
		return spoksPermission;
	}




	public void setSpoksPermission(boolean spoksPermission) {
		this.spoksPermission = spoksPermission;
	}




	public String getEligibility() {
		return eligibility;
	}




	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public void eligibilityTest() {
		String req[]= {"License", "Registration", "Beetle's Fanclub Membership", "Astraunaut's License"};
		String has[]=this.getPapersNeeded().split(", ");

		boolean papers=true;
		
		if(has.length!=req.length) papers=false;
		else
			for(int i=0;i<req.length;i++)
				if(!req[i].toLowerCase().equals(has[i].toLowerCase())) papers=false;
		
		if(this.getSpaceSuite().toLowerCase().equals("yes") && this.getLicenseValidUpto()>2023 && papers && this.isSpoksPermission() ) {
			setEligibility("May the force be with you!");
		}
		else setEligibility("Not today chap!");
		
	}
	
}