/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: A library for reading in 2D arrays of integers, doubles,
  			  or booleans from standard input and printing them out to
              standard output.							
 * @Date    : 14:11:2019
 * @File    : TwoDArray.java 
 */
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TwoDArray<T> {
	public static void main(String[] args) {
		Object arr[][] = Utility.TwoDInput();
		for (Object n[] : arr) {
			for (Object m : n) {
				System.out.print(m +" ");
			}
			System.out.println();
		}
	}
}
