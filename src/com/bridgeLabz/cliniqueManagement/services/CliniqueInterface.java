package com.bridgeLabz.cliniqueManagement.services;

public interface CliniqueInterface {
	void doctorDetails();

	void readDoctorData(String key, String value, String choice);

	void readPatientData(String key, String value);
}
