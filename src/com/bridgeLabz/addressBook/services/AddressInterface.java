package com.bridgeLabz.addressBook.services;

import org.json.simple.JSONArray;

public interface AddressInterface 
{
	void viewAddressBook();
	
	void addperson();
	void deleteperson();
	void sortbyname();
	void sortbyzip();
	void printEntries();
	
	void createNewAddressBook();
				
	
	void quit();

}
