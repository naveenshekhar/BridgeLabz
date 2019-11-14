/* @Author  : Naveen Shekhar
 * @version : 1.0
 * @ purpose: Generating no. of notes by taking user input.
 * @Date    : 14:11:2019
 * @File    : VendingMachine.java 
 */
package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Enter Amount :");
		int amount=Utility.sc.nextInt();
		int []notes= {1000,500,100,50,10,5,2,1};
		int []count= {0,0,0,0,0,0,0,0};
		for(int i=0;i<notes.length;i++)
		{
		 if(amount>=notes[i])
		 {
			 count[i]=amount/notes[i];
			 amount=amount-(count[i]*notes[i]);
		 }
		}
		System.out.println("changes: ");
		for(int i=0;i<notes.length;i++)
		{
			System.out.println(notes[i]+" "+count[i]);
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


