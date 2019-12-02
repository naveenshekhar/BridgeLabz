/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Program to Add the Prime Numbers that are Anagram 
 * 			  in the Range of 0 - 1000 in a Queue using the Linked
 * @Date    : 26:11:2019
 * @File    : PrimeAnagramQueue.java
 * ***************************************************/

package com.bridgelabz.dataStructure;

import com.bridgelabz.dataStructure.base.Queue;
import com.bridgelabz.utility.DSUtility;

public class PrimeAnagramQueue
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new Queue<Integer>();
		for(int i=2;i<1000;i++)
		{
			if(DSUtility.isPrime(i))
			{
				q.enqueue(i);
			}
		}
		int s=q.size();
    int []arr=new int[s];	
    for(int i=0;i<s;i++)
    {
    	arr[i]=q.dequeue();
    }
    for(int i=0;i<s;i++)
    {
    	for(int j=i+1;j<s;j++)
    	{
    		if(DSUtility.isAnagram(arr[i], arr[j]) && arr[i]!=0 && arr[j]!=0)
    		{
    			//System.out.println(arr[i]+ " "+arr[j]);
    			q.enqueue(arr[i]);
    			q.enqueue(arr[j]);
    		}
    	}
    }
       q.show();		
	}

}
