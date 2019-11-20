/**
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: program takes Strings s1 and s2 
   			  and checks they are anagram or not
   			  to the origin (0, 0). 	
 * @Date    : 16:11:2019
 * @File    : Anagram.java 
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class AnagramString {
	public static void main(String[] args) {
		System.out.println("Enter first String :");
		String s1 = Utility.sc.next();
		System.out.println("Enter Second String :");
		String s2 = Utility.sc.next();
		Utility.isAnagram(s1, s2);

	}

}
