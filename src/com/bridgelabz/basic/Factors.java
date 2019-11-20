/**
 *  @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Finding the Prime factors of user input number 
  			  by using brute force method	
 * @Date    : 14:11:2019
 * @File    : Factors.java 
 * */
package com.bridgelabz.basic;

import com.bridgelabz.utility.Utility;

public class Factors {
	public static void main(String[] args) {

		System.out.println("Enter your number to get prime factors :");
		int n = Utility.sc.nextInt();

		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		System.out.println(n);
	}

}
