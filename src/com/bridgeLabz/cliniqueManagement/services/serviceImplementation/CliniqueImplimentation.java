package com.bridgeLabz.cliniqueManagement.services.serviceImplementation;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.cliniqueManagement.controller.Main;
import com.bridgeLabz.cliniqueManagement.model.DoctorModel;
import com.bridgeLabz.cliniqueManagement.repository.CliniqueManagement;
import com.bridgeLabz.cliniqueManagement.services.CliniqueInterface;
import com.bridgeLabz.cliniqueManagement.utility.Utility;

public class CliniqueImplimentation implements CliniqueInterface {

	JSONArray jarr = new JSONArray();
	JSONObject jobj = new JSONObject();

	static String doctor = "/home/user/git/oops/oops/src/com/bridgeLabz/cliniqueManagement/doctor.json";
	static String patient = "/home/user/git/oops/oops/src/com/bridgeLabz/cliniqueManagement/patient.json";
	static String appointment = "/home/user/git/oops/oops/src/com/bridgeLabz/cliniqueManagement/appointment.json";

	@SuppressWarnings("unchecked")
	@Override
	public void doctorDetails() {
		jarr = CliniqueManagement.readData(doctor);

		DoctorModel doctorDetails = new DoctorModel();
		System.out.println("Enter Doctor Name");
		String doctorName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(doctorName)) {
			doctorDetails.setName(doctorName);
		}

		System.out.println("Enter Doctor Specialization");
		String specialization = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpeciallization(specialization);
		}

		System.out.println("Enter Doctor Availability");
		String availability = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setAvailability(availability);
		}

		doctorDetails.setID(Utility.doctorId());
		doctorDetails.setNoOfpatients(0);

		jobj.put("Id", doctorDetails.getID());
		jobj.put("Name", doctorDetails.getName());
		jobj.put("Specialization", doctorDetails.getSpeciallization());
		jobj.put("Availability", doctorDetails.getAvailability());
		jobj.put("Patients", doctorDetails.getNoOfpatients());

		jarr.add(jobj);

		System.out.println(jarr);
		CliniqueManagement.writeData(doctor, jarr);

	}

	@Override
	public void readDoctorData(String key, String value, String choice) {
		

		//	adds json data to json array
		jarr = (JSONArray) CliniqueManagement.readData(doctor);
		//	iterator to iterate json data
		Iterator iterator = jarr.iterator();
		//	json objects top store json data from array
		JSONObject jsonObject, lastJasonObject = null;
		
		//	iterates over json array
		while (iterator.hasNext()) {
			//	checks if data given by user matches with any json object
			//	and if present prints it
			if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
				lastJasonObject = jsonObject;
				System.out.println("\nDoctor Information:");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Specialization: " + jsonObject.get("Specialization") + "\t");
				System.out.println("Availability: " + jsonObject.get("Availability") + "\t");
				System.out.println("Number of Patients: " + jsonObject.get("Patients") + "\n");
				
				//asks user if want to take an appointment
				System.out.println("Do you want to take an appointment?[y/n]");
				String response = Utility.inputString().toLowerCase();
				if (response.equals("y")) {
			//		makeAppointment(lastJasonObject);
				}
				else {
					Main.menu();
				}
			}
			System.out.println("Enter valid Doctor "+key);
			Main.doctorChoice(choice);
		}

	}

	@Override
	public void readPatientData(String key, String value) {

	}

}
