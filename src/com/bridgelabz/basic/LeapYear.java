package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check :");
		int n = sc.nextInt();
		Utility.isLeapYear(n);
		sc.close();
	}

}
