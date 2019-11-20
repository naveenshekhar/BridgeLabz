/**
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: program takes String Array as input and prints
 * 			  in sorted order.
 * @Date    : 16:11:2019
 * @File    : InsertionSortString.java 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSortString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int size = sc.nextInt();
		String array[] = Utility.Input1DStringArray(size);
		array = Utility.insertionSortString(array);
		Utility.print1DStringArray(array);
		sc.close();
	}
}
