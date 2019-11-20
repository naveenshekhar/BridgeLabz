package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class AnagramString {
	public static void main(String[] args) {
		System.out.println("Enter first String :");
		String s1=Utility.sc.next();
		System.out.println("Enter Second String :");
		
		
		String s2=Utility.sc.next();
		
		Utility.isAnagram(s1, s2);

	}

}
