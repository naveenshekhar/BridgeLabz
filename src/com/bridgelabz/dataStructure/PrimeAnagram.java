package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.DSUtility;

public class PrimeAnagram {
	public static void main(String[] args) {
		int arr[] = new int[1000];
		int range = 2;
		for (int i = 0; i < arr.length; i++) {
			if (DSUtility.isPrime(range)) {

				arr[i] = range;
			}
			range++;
		}
		for (int k = 0; k < arr.length / 10; k++) {
			for (int j = k + 1; j < arr.length / 10; j++) {
				if (DSUtility.isAnagram(arr[k], arr[j]) && arr[k] != 0 && arr[j] != 0) {
					System.out.println(arr[k] + " " + arr[j]);
				}
			}
		}
	}
}
