/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Finding the Prime factors of user input number 
  			  by using brute force method	
 * @Date    : 14:11:2019
 * @File    : Factors.java 
 * */
package com.bridgelabz.basic;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to get prime factors :");
		int n = sc.nextInt();

		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		System.out.println(n);
		sc.close();

	}

}
