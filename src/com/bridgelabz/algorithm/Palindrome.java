/**
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Program Checks the number is palindrome or not.
 * @Date    : 17:11:2019
 * @File    : Palindrome.java 
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter number to check :");
		int n = Utility.sc.nextInt();
		System.out.println(Utility.isPalindrome(n));

	}

}
