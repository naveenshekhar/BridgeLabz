package com.bridgeLabz.addressBook.controller;

import java.util.Scanner;

import com.bridgeLabz.addressBook.services.serviceImplementation.AddressBokImplementation;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AddressBokImplementation abi=new AddressBokImplementation();
		
		System.out.println("Enter 1 to view address book.");
		System.out.println("Enter 2 to add a person.");
		System.out.println("Enter 3 to remove a person.");
		System.out.println("Enter 4 to sort by name address book.");
		System.out.println("Enter 5 to sort by zip address book.");
		System.out.println("Enter 6 to add new address book.");
		System.out.println("Enter 7 to Quit.");
		System.out.println(":");
		int n = sc.nextInt();

//		int f = 0;
//		while (f == 0) {
			switch (n) {
			case 1:
				abi.viewAddressBook();
				break;
			case 2:
				abi.addperson();
				break;
			case 3:
				abi.deleteperson();
				break;
			case 4:
				abi.sortbyname();
				break;
			case 5:
				abi.sortbyzip();
				break;
			case 6:
				abi.createNewAddressBook();
				break;
			case 7:
	//			f=1;
				break;
			default:
				System.out.println("Invalid input..!!");
			}
		}

	//}

}
