package com.bridgelabz.utility;

public class DSUtility<T> {

	public static boolean isPalindrome(String input) {
		char[] arr = input.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i];
		}
		if (rev.equals(input)) {
			return true;
		} else
			return false;
	}
}
