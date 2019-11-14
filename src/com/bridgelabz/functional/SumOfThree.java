/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Finding the three nums whose sum will give 0.					
 * @Date    : 14:11:2019
 * @File    : SumOfThree.java 
 */
package com.bridgelabz.functional;

public class SumOfThree {
	public static void isSumOfThree() {
		int[] a = { 12, 7, 9, -15, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = j; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println("Numbers are :" + a[i] + ", " + a[j] + ", " + a[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		isSumOfThree();
	}
}
