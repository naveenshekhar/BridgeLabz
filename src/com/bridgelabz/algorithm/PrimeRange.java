/**
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Program to print prime numbers between range.
 * @Date    : 17:11:2019
 * @File    : PrimeRange.java 
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PrimeRange {
	public static void main(String[] args) {
		System.out.println("Enter Range :");
		int n = Utility.sc.nextInt();
		Utility.isPrime(n);
	}
}
