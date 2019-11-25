package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.Stack;
import com.bridgelabz.utility.DSUtility;

public class PrimeAnagramUsingStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		for(int i=2;i<=1000;i++)
		{
			if(DSUtility.isPrime(i))
			{
				s.push(i);
			}
		}
//		s.show();
		int arr[]=new int[s.size()];
		int u=s.size();
		for(int i=0;i<u;i++)
		{
			
			arr[i]=s.pop();
		}
		
		for(int i=0;i<u;i++)
		{
			for(int j=i+1;j<u;j++)
			{
				if(DSUtility.isAnagram(arr[i], arr[j]) && arr[i]!=0 && arr[j]!=0)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
