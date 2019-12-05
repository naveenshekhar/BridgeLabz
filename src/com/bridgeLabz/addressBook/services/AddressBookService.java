package com.bridgeLabz.addressBook.services;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.addressBook.model.Person;


public interface AddressBookService {

	void store(Person person);

	void edit(File file, String name);

	void delete(File file, String name);

	JSONObject search(File file, String name);

	void addAddressBook(String name);

	void deleteAddressBook(String name);

	File listOfFiles();


}