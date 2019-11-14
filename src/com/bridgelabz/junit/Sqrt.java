/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: compute the square root of a non-negative number.
 * @Date    : 14:11:2019
 * @File    : Sqrt.java 
 * */
package com.bridgelabz.junit;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of 'c' :");
		double c = sc.nextInt();

		Utility.isSqrt(c);
		sc.close();
	}

}
