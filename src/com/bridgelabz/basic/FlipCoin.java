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
