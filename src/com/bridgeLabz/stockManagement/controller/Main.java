package com.bridgeLabz.stockManagement.controller;

import java.util.Scanner;

import com.bridgeLabz.stockManagement.services.serviceImplementation.StockImplementation;

public class Main {
	public static void main(String[] args) {
		StockImplementation si = new StockImplementation();
		int temp = 0;
		while (temp == 0) {
			Scanner sc = new Scanner(System.in);
			System.out
					.println("Enter \n 1 to view company \n 2 to add \n 3 to remove \n 4 to stock report \n 5 to exit");
			int n = sc.nextInt();

			switch (n) {
			case 1:
				break;
			case 2:
				si.add();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				temp=1;
				System.out.println("Thanks for visiting...!!");
				break;
			default:
				System.out.println("Invalid input..!!");
				break;
			}

		}

	}

}
