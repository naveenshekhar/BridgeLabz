package com.bridgeLabz.cliniqueManagement.controller;

import com.bridgeLabz.cliniqueManagement.services.serviceImplementation.CliniqueImplimentation;
import com.bridgeLabz.cliniqueManagement.utility.Utility;

public class Main {
	static CliniqueImplimentation service = new CliniqueImplimentation();

	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		System.out.println("Select option");
		System.out.println("1. Add Doctor Details");
		System.out.println("2. Search Doctor");
		System.out.println("3. Search Patient");
		System.out.println("4. Exit");

		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			switch (choice) {
			case "1":
				service.doctorDetails();
				menu();
				break;
			case "2":
				doctorInput();
				break;
			case "3":
				patientInput();
				break;
			case "4":
				Utility.quit();
				System.out.println("Thanks!!! Have a nice Day ");
				break;
			default:
				System.out.println("Invalid option");
				menu();
				break;
			}
		} else {
			System.out.println("Enter numbers only");
			menu();
		}
	}

	private static void doctorInput() {
		System.out.println("Search doctor by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Specialization");
		System.out.println("4. Availability");
		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			doctorChoice(choice);
		} else {
			System.out.println("Enter numbers only");
			doctorInput();
		}
	}

	public static void doctorChoice(String choice) {
		switch (choice) {
		case "1":
			System.out.print("Enter name:");
			service.readDoctorData("Name", Utility.inputString(), choice);
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readDoctorData("Id", Utility.inputString(), choice);
			break;
		case "3":
			System.out.print("Enter speacialization:");
			service.readDoctorData("Specialization", Utility.inputString(), choice);
			break;
		case "4":
			System.out.print("Enter availability::");
			service.readDoctorData("Availability", Utility.inputString(), choice);
			break;
		default:
			System.out.println("select valid option\n");
			doctorChoice(choice);
		}
	}

	private static void patientInput() {
		System.out.println("Search patient by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Mobile Number");
		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			patientChoice(choice);
		} else {
			System.out.println("Enter numbers only");
			doctorInput();
		}
	}

	private static void patientChoice(String choice) {
		switch (choice) {
		case "1":
			Utility.inputString();
			System.out.print("Enter name:");
			service.readPatientData("Name", Utility.inputString());
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readPatientData("Id", Utility.inputString());
			break;
		case "3":
			System.out.print("Enter mobile number:");
			service.readPatientData("Mobile", Utility.inputString());
			break;
		default:
			System.out.println("Please select valid option");
			patientChoice(choice);
			break;
		}
	}

}
