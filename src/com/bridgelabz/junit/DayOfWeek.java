/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Using the given formula to get Gregorian calander.
 * @Date    : 14:11:2019
 * @File    : DayOfWeek.java 
 * */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		Utility.isWeek(d, m, y);
	}

}
