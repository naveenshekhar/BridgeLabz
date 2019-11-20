/**
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Program to print the percentage of head vs tail,
 * 			  user gives the input for number of toss,
 * 			  computer decides the head vs tail using random function.
 * @Date    : 17:11:2019
 * @File    : FlipCoin.java 
 */
package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times you want to flip the coin :");
		int n = sc.nextInt();
		Utility.isFlip(n);
		sc.close();
		
	}

}
