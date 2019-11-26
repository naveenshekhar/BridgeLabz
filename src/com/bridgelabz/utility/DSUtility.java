/* **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose: Utility(Data Structure) 
 * @Date    : 21:11:2019 - 27:11:2019
 * @File    : DSUtility.java
 * ***************************************************/

package com.bridgelabz.utility;

import java.util.Arrays;

public class DSUtility {
	
	/**
	 * @purpous Function To check the number is prime or not
	 * @param   Integer n
	 * @return  boolean
	 */
	public static boolean isPrime(int n) {
		boolean res = true;

		for (int j = 2; j <= n / 2; j++) {
			if (n % j == 0) {
				res = false;
				break;
			}
		}
		return res;
	}

	
	/**
	 * @purpous To return count on any value
	 * @param   integer n
	 * @return  integer count. 
	 */
	public static int count(int n) {
		String str1 = String.valueOf(n);
		int l1 = str1.length();
		return l1;
	}

	/**
	 * @purpous To check two numbers are anagram or not. 
	 * @param   n
	 * @param   m
	 * @return  boolean
	 */
	public static boolean isAnagram(int n, int m) {

		int l1 = count(n);
		int l2 = count(m);
		if (l1 != l2) {
			return false;
		}
		int i = 0;
		int j = 0;
		int n1[] = new int[l1];
		int n2[] = new int[l2];
		while (n != 0) {
			int r = n % 10;
			n1[i] = r;
			n /= 10;
			i++;
		}
		j=0;
		while (m != 0) {
			int e = m % 10;
			n2[j] = e;
			m /= 10;
			j++;
		}
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		if (Arrays.equals(n1, n2))
			return true;
		else
			return false;	
	}
}