package com.bridgelabz.objectOrientedP.controller;

import com.bridgelabz.objectOrientedP.service.serviceImplementation.InventoryImplementation;
import com.bridgelabz.utility.Utility;

public class Main 
{
	public static void main(String[] args) 
	{
		int temp=0;
		while(temp==0) {
			
		
		System.out.println("Enter to \n 1 :: view \n 2 :: Add \n 3 :: remove \n 4 :: Total price \n 5 :: Total weight \n 6 :: Exit");
		int n=Utility.sc.nextInt();
		InventoryImplementation inventoryObject= new InventoryImplementation();
		switch (n)
		{
		case 1:
			inventoryObject.view();
			break;
		case 2:
			inventoryObject.add();
			break;
		case 3:
			inventoryObject.remove();
			break;
		case 4:
			inventoryObject.totalPrice();
			break;
		case 5:
			inventoryObject.totalWeight();
			break;
		case 6:
			System.out.println("thank you...........");
			temp = 1;
			break;
		default: 
			System.out.println("Invalid input");
			break;
		}
		}
	}

}
