package com.bridgeLabz.cliniqueManagement.utility;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void quit() {
		System.exit(0);

	}

	/*
	 * Return Input Integer
	 */
	public static int inputIntegerOne() {
		try {

			return Integer.parseInt(scanner.nextLine());

		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return 0;
	}

	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return 0;
	}

	public static boolean checkStringOne(String userInput) {

		char ch[] = userInput.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				return false;
			}
		}
		return true;
	}

	public static boolean intChecker(String number) {
		// regular expression for an integer number
		String regex = "[+-]?[0-9][0-9]*";

		// compiling regex
		Pattern p = Pattern.compile(regex);

		// Creates a matcher that will match input1 against regex
		java.util.regex.Matcher m = p.matcher(number);

		if (m.find() && m.group().equals(number))
			return true;

		return false;

	}

	/*
	 * Return Input Double
	 */
	public static double inputDouble() {
		try {
			if (scanner.hasNextDouble()) {
				return scanner.nextDouble();
			}
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return 0.0;
	}

	/*
	 * Return Input Long
	 */
	public static long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return 0;
	}

	/*
	 * Return Input String
	 */
	public static String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return null;
	}

	/*
	 * Return Input String
	 */
	public static String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	/*
	 * Return Input Float
	 */
	public static float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0F;
	}

	/*
	 * Return Input Boolean
	 */
	public static boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}

	public static boolean stringChecker(String str) {
		char[] ch = str.toCharArray();
		@SuppressWarnings("unused")
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

	public static String doctorId() {
		String output = "";
		String doctorId = "DOC";
		for (int i = 0; i < 3; i++) {
			output += random.nextInt(10);
		}
		int outputInt = Integer.parseInt(output);
		return doctorId += outputInt;

	}

	public static String patientId() {
		String output = "";
		String doctorId = "PAT";
		for (int i = 0; i < 3; i++) {
			output += random.nextInt(10);
		}
		int outputInt = Integer.parseInt(output);
		return doctorId += outputInt;

	}

	public static boolean mobileNumberValidator(String number) {
		if (number.matches("^[789]\\d{9}$")) {
			return true;
		}
		return false;
	}

}