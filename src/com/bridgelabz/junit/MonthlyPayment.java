/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Calculating monthly payment after taking a loan.
 * @Date    : 14:11:2019
 * @File    : MonthlyPayment.java 
 * */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		int R = Integer.parseInt(args[2]);

		Utility.isMonthlyPayment(P, Y, R);
	}

}
