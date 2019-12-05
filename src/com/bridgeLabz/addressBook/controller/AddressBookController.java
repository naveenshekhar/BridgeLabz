package com.bridgeLabz.addressBook.controller;

import java.io.File;

import org.json.simple.JSONObject;

import com.bridgeLabz.addressBook.model.Person;
import com.bridgeLabz.addressBook.repository.AddressBookRepository;
import com.bridgeLabz.addressBook.services.AddressBookService;
import com.bridgeLabz.addressBook.services.serviceImplementation.AddressBookServiceImpl;
import com.bridgeLabz.addressBook.utility.Utility;


public class AddressBookController {
	static Utility utility = new Utility();
	static AddressBookService bookService = new AddressBookServiceImpl();
	static AddressBookRepository bookRepository = new AddressBookRepository();
	static String name;
	public static void main(String[] args) {
		
		AddressBookController.addressBookMenu();
		//AddressBookController.personMenu();
		
	}

	
	public static void addressBookMenu() {
		System.out.println("1. Add Address Book");
		System.out.println("2. Delete Address Book");
		System.out.println("3. Select Address Book");
		String select = Utility.inputString();
		if(Utility.stringChecker(select)) {
			switch (select) {
			case "1":
				System.out.println("Enter Address Book Name");
				name = Utility.inputString();
				bookService.addAddressBook(name);
				addressBookMenu();
				break;
			case "2":
				System.out.println("Enter Address Book Name");
				name = Utility.inputString();
				bookService.deleteAddressBook(name);
				addressBookMenu();
				break;
			case "3":
				File file = bookService.listOfFiles();
				//System.out.println("Controller :"+file);
				personMenu(file);
			break;
			default:
				break;
			}
		}
	}
	public static void personMenu(File file) {
		System.out.println("\nSelect following option to perform some action..\n");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");
		String select = Utility.inputString();
		if(Utility.stringChecker(select)) {
			switch (select) {
			case "1":
				//AddressBookController.addUser();
				JSONObject temp = AddressBookServiceImpl.addUser(file);
				AddressBookRepository.writeDataNew(temp, file);
				personMenu(file);
				break;
			case "2":
				System.out.println("Enter the first name :");
				name = Utility.inputString();
				bookService.edit(file, name);
				personMenu(file);
				break;
			case "3":
				System.out.println("Enter first name :");
				name = Utility.inputString();
				bookService.delete(file,name);
				personMenu(file);
				break;
			case "4":
				System.out.println("Enter first name :");
				name = Utility.inputString();
				bookService.search(file,name);
				personMenu(file);
				break;
			case "5":
				System.out.println("Thanks!!!");
				break;
			default:
				break;
			}
		}
	}

	public static void addUser() {
		String firstName,lastName,address,city,state;
		String zip;
		String mobile;
		
		@SuppressWarnings("static-access")
		JSONObject jsonObject = bookRepository.readData();
		jsonObject = (JSONObject) jsonObject.get("Address Book");
		
		
		Person person = new Person();
		System.out.println("Enter first Name :");
		firstName = Utility.getString(false);
		
		
		System.out.println("Enter Last Name :");
		lastName = Utility.getString(false);
		
		System.out.println("Enter Address :");
		address = Utility.getString(false);
		
		System.out.println("Enter city Name :");
		city = Utility.getString(false);
		
		System.out.println("Enter State Name :");
		state = Utility.getString(false);

		System.out.println("Enter Zip Code:");
		zip = Utility.inputString();
		if (Utility.stringChecker(zip)) {
			person.setZip(Integer.parseInt(zip));
		}
		
		System.out.println("Enter 10 digit Phone Number :");
		mobile = Utility.inputString();
		if (Utility.stringChecker(zip)) {
			person.setPhonenumber(Long.parseLong(mobile));
		}
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setCity(city);
		person.setAddress(address);
		person.setState(state);
		
		bookService.store(person);
		personMenu(null);
		
	}
}