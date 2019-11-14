/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: program takes two integer command-line arguments
   			  x and y and prints the distance from the point (x, y)
   			  to the origin (0, 0). 	
 * @Date    : 14:11:2019
 * @File    : Distance.java 
 */
package com.bridgelabz.functional;

public class Distance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int distance = (int) Math.sqrt((x ^ x + y ^ y));
		System.out.println("Distance :" + distance);

	}

}
