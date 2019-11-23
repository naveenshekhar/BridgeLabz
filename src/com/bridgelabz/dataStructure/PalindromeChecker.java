package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.DeQueue;
import com.bridgelabz.utility.Utility;

public class PalindromeChecker <T>
{
	public static void main(String[] args) 
	{
		DeQueue<Character> dq=new DeQueue<Character>();
		System.out.println("Enter element to check");
		String input=Utility.sc.next();
		
		char ch[]=input.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			dq.addFront(ch[i]);
		}
		String rev="";
		for(int j=0;j<ch.length;j++)
		{
			rev=rev+dq.removeFront();
		}
		if(input.equals(rev))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	}
}
