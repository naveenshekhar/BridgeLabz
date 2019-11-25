package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.DSUtility;

public class Prime2D {
	public static void main(String[] args) {
		int range = 1;
		int prime[][] = new int[10][100];
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 100; i++) {
				if (DSUtility.isPrime(range)) {
					prime[j][i] = range;
				} else {
					prime[j][i] = -1;
				}
				range++;
			}
		}
		for (int i[] : prime) {
			for (int j : i) {
				if (j != -1 && j != 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
