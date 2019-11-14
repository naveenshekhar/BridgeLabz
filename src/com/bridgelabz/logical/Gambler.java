/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Simulating a gambler game and taking user input for  Stack, chances and goal.
 * @Date    : 14:11:2019
 * @File    : Gambler.java 
 */
package com.bridgelabz.logical;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stake :");
		int stake = sc.nextInt();
		System.out.println("Enter Goal :");
		int goal = sc.nextInt();
		System.out.println("How many times you want to bet :");
		int chance = sc.nextInt();
		double win = 0;
		double loss = 0;
		double total = 0;

		for (int i = 0; i <= chance; i++) {
			if (Math.random() > 0.5) {
				win++;
				total++;
				stake = stake + 1;
				if (stake == goal) {
					System.out.println("You won..!!");
				}
			} else {
				loss++;
				total++;
				stake = stake - 1;
				if (stake == 0) {
					System.out.println("You Lost..!!");
				}
			}
		}
		double w_per = (win / total) * 100;
		double l_per = (loss / total) * 100;
		System.out.println("you won " + win + " times.");
		System.out.println("you lost " + loss + " times.");
		System.out.println("your winning % is " + w_per);
		System.out.println("your loss % is " + l_per);
		sc.close();

	}

}
