package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int n = sc.nextInt();
		Utility.isHarmonic(n);
		sc.close();
	}
}
