package com.bridgeLabz.cliniqueManagement.model;

public class DoctorModel 
{
	private String name;
	private String ID;
	private String speciallization;
	private String availability;
	private long noOfpatients;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSpeciallization() {
		return speciallization;
	}
	public void setSpeciallization(String speciallization) {
		this.speciallization = speciallization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public long getNoOfpatients() {
		return noOfpatients;
	}
	public void setNoOfpatients(long noOfpatients) {
		this.noOfpatients = noOfpatients;
	}

}
