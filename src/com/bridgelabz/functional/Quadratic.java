/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Finding the roots of given equation,
  			  taking input from user as "a,b and c".				
 * @Date    : 14:11:2019
 * @File    : Quadratic.java 
 */
package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
	public static void isQuadratic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = sc.nextInt();
		System.out.println("Enter value of b :");
		int b = sc.nextInt();
		System.out.println("Enter value of c :");
		int c = sc.nextInt();

		int delta = b * b - 4 * a * c;
		int root1 = (int) ((-b + Math.sqrt(delta)) / 2 * a);
		int root2 = (int) ((-b - Math.sqrt(delta)) / 2 * a);

		System.out.println("Root 1 of 'X' :" + root1);
		System.out.println("Root 2 of 'X' :" + root2);
		sc.close();
	}

	public static void main(String[] args) {
		isQuadratic();

	}

}
