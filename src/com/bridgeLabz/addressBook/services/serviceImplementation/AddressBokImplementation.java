package com.bridgeLabz.addressBook.services.serviceImplementation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

import com.bridgeLabz.addressBook.model.AddressBookModel;
import com.bridgeLabz.addressBook.repository.AddressBook;
import com.bridgeLabz.addressBook.services.AddressInterface;

public class AddressBokImplementation implements AddressInterface {

	JSONArray jarr = new JSONArray();
	JSONObject jobj = new JSONObject();
	AddressBookModel ab=new AddressBookModel();

	static String path = "/home/user/git/oops/oops/src/com/bridgeLabz/addressBook/AddressBook.json";

	@Override
	public void viewAddressBook() {

		System.out.println("----------Person Details----------\n");
		System.out.println("Name :" + ab.getFname() + " " + ab.getLname());
		System.out.println("\nAddress :" + ab.getAddress());
		System.out.println("\nCity :" + ab.getCity());
		System.out.println("\nState :" + ab.getState());
		System.out.println("\nZip :" + ab.getZip());
		System.out.println("\nMobile :" + ab.getPhone());

	}

	@Override
	public void addperson() {
		

	}

	@Override
	public void deleteperson() {

	}

	@Override
	public void sortbyname() {

	}

	@Override
	public void sortbyzip() {

	}

	@Override
	public void printEntries() {

	}

	@Override
	public void createNewAddressBook() {

	}

	@Override
	public void quit() {

	}

}
