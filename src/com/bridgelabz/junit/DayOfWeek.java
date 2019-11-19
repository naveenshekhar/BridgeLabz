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

		int d0=Utility.isWeek(d, m, y);
		switch (d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

}
