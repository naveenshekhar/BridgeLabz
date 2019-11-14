/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: conversion of temprature from celsious to fahrenheit 
 * @Date    : 14:11:2019
 * @File    : temperaturConversion.java 
 * */
package com.bridgelabz.junit;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class temperaturConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'F' to convet from celcious to Fahrenheit and 'C' for vice-versa :");
		String i = sc.next();

		System.out.println("Enter Temprature to convert :");
		int temp = sc.nextInt();

		Utility.isTemprature(temp, i);
		sc.close();
	}

}
