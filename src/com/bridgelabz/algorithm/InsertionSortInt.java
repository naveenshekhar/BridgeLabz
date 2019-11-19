package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class InsertionSortInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int array[] = Utility.input1DArray(size);
		array = Utility.insertionSort(array);
		Utility.print1DArray(array);
		sc.close();
	}

}
