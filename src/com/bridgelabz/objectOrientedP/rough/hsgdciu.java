package com.bridgelabz.objectOrientedP.rough;

public class hsgdciu 
{
	public static void main(String[] args) 
	{
		int n[]= {1,2,3,4,5,6,7,8};
		int m[]= {1,2,3,4,5,6};
		int count = 0;
		int count1=0;
		int f=0;
		
		for(int i:n)
		{
			for(int j:m)
			{
				if(i==j)
				{
					f=1;
					break;
				}
				else
				{
					f=0;
				}
			}
			if(f==0)
			{
				count++;
			}
		}
		System.out.println(count++);
		
	}

}
