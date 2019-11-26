/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : To mimic the banking cash counter using Queue
 *            present in Base package.
 * @Date    : 25:11:2019
 * @File    : BankingCashCounter.java
 * ***************************************************/

package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.Queue;
import com.bridgelabz.utility.Utility;

public class BankingCashCounter 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new Queue<Integer>();
//Initial amount in bank
		int amount=1000000;		
//Tacking input for people in queue
		System.out.println("Enter how many people are in queue :");
		int people=Utility.sc.nextInt();
		for(int i=0;i<people;i++)
		{
			q.enqueue(i);
			System.out.println("Enter 1 if you want to deposite enter 2 if you want to withdrawl :");
			int purpous=Utility.sc.nextInt();
//withdrawl and deposit by each one in queue.
			switch(purpous)
			{
			case 1:
				System.out.println("Enter how much you want to deposite :");
				int deposite=Utility.sc.nextInt();
				amount=amount+deposite;
				q.dequeue();
				break;
				
			case 2:
				System.out.println("Enter how much you want to withdrawl  :");
				int withdrawl=Utility.sc.nextInt();
				amount=amount-withdrawl;
				q.dequeue();
				if(amount==0 || amount < withdrawl)
				{
					System.out.println("Sorry..we are out of cash..!!");
				}
			
				break;
		default :
			System.out.println("Sorry...but its a Invalid input :");
			}
			
			if(amount==0)
			{
				System.out.println("Sorry..we are out of cash..!!");
			}
			
		}
		
		
	}

}
