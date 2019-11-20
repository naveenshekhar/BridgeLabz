/**
 *  @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: program takes a input between 0 to n and guess the 
 * 			  number.	
 * @Date    : 16:11:2019
 * @File    : GuessGame.java 
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class GuessGame {
	public static int guessNumber(int number) {
		if (number <= 100) {
			int low = 0, high = 100, mid;
			while (low != high) {
				mid = (low + high) / 2;
				System.out.println("Enter 1 if number between " + low + "-" + mid + " Enter 2 if number between "
						+ (mid + 1) + "-" + high);
				int c = Utility.sc.nextInt();
				if (c == 1)
					high = mid;
				else
					low = mid + 1;
			}
			return low;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int number = Utility.sc.nextInt();
		int number1 = GuessGame.guessNumber(number);
		if (number1 == 0) {
			System.out.println("Enter the correct number");
		} else {
			System.out.println("Guess number is " + number1);
		}
	}

}
