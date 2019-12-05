package com.bridgeLabz.addressBook.utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import com.bridgeLabz.addressBook.controller.AddressBookController;

public class Utility {

	static Scanner sc = new Scanner(System.in);
	static String inputString = "";
	static boolean flag = false;

	public static String getString(boolean details) {
		inputString = "";
		while (inputString.equals("")) {
			sc.reset();
			inputString = sc.nextLine();
			if (!details) {
				if (!Pattern.matches("\\D*[^\\s]", inputString)) {
					System.out.println("Please enter valid String");
					AddressBookController.addUser();
					inputString = "";
				}
			}
		}
		return inputString;
	}

	public static int inputinteger() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public static String inputString() {
		try {
			return sc.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	public static long inputLong() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		Predicate<Character> p = s -> s >= 97 && s <= 122 || s >= 65 && s <= 90 || s >= 48 && s <= 57;
		for (char i : ch) {
			if (p.test(i)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Integer check
	 */
	public static boolean checkInteger(String number) {
		char ch[] = number.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				return true;
			}
		}
		return false;
	}

	/*
	 * @param-type: integer
	 * 
	 * @return-type: boolean
	 * 
	 */
	public boolean validOption(int option) {
		if (option == 1 || option == 2 || option == 3)
			return true;
		return false;
	}

	public static FileWriter fileWriterObject() {
		FileWriter fileWriter=null;
		try{
			fileWriter = new FileWriter("JsonFile");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileWriter;
	}
}