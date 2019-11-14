/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose:Stopwatch Program for measuring the time that elapses between the start and end
 * @Date    : 14:09:19
 * @File    : Stopwatch.java 
 */
package com.bridgelabz.logical;

import java.time.LocalTime;
import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'S' to start and 'E' to stop the stopwatch :");
		char ch = sc.next().charAt(0);

		if (ch == 's' || ch == 'S') {
			System.out.println("Stopwatch Started..!!");
			LocalTime l = java.time.LocalTime.now();
			int h = l.getHour();
			int m = l.getMinute();
			int s = l.getSecond();
			System.out.println(l);

			char ch1 = sc.next().charAt(0);

			if (ch1 == 'e' || ch1 == 'E') {
				System.out.println("Stopwatch stopped..!!");
				LocalTime l1 = java.time.LocalTime.now();
				int h1 = l1.getHour();
				int m1 = l1.getMinute();
				int s1 = l1.getSecond();

				int hour = h1 - h;
				int minute = m1 - m;
				int second = s1 - s;

				System.out.println("Hour:Minute:Second=" + hour + ":" + minute + ":" + second);
			}
		}
		sc.close();
	}

}
