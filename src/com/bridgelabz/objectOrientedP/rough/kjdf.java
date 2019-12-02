package com.bridgelabz.objectOrientedP.rough;

import java.time.LocalTime;
import java.util.Scanner;

public class kjdf 
{
	public static void main(String[] args) {
		
//		String a="rahul";
//		String b="sonu is my name";
//		
//		String c=new String("rahul");
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(a.equals(c));
//		String []e=b.split(" ");
//		char []d=a.toCharArray();
////reverse the string
//		String f[]=b.split(" ");
//		for(int k=f.length-1;k>=0;k--)
//		{
//			System.out.print(f[k]+" ");
//		}
//		System.out.println();
////reverse each word of string
//		for(String i:e)
//		{
//			//System.out.print(i+" ");
//			String word=i;
//			char ch[]=word.toCharArray();
//			for(int j=ch.length-1;j>=0;j--)
//			{
//				System.out.print(ch[j]);
//			}
//			System.out.print(" ");
//		}
//		System.out.println();
////Position of the word
//		int index=0;
//		String word="my";
//		String []words=b.split(" ");
//		for(int i=0;i<words.length;i++)
//		{
//			if(word.equals(words[i]))
//			{
//				System.out.println(i);
//			}
//		}
//		for(int i=0;i<d.length;i++)
//		{
//			System.out.print(d[i]+" ");
//		}
//		for(char i:d)
//		{
//			System.out.print(i+" ");
//		}
//		int m=32;
//		for(int i=2;i<m/2;i++)
//		{
//			while(m%i==0)
//			{
//				System.out.println(i+" ");
//				m=m/i;
//			}
//		}
//		if(m>=2)
//		System.out.println(m);
		
	//PRINT THE COUPON NUMBER
//		String str1="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
//		char ch[]=str1.toCharArray();
//		int max=100000000;
//		int random=(int)(Math.random()*max);
//		StringBuffer sb=new StringBuffer();
//		while(random>0)
//		{
//			sb.append(ch[random%ch.length]);
//			random=random/ch.length;
//		}
//		String coupon=sb.toString();
//		System.out.println("Coupon :"+coupon);
		
	//SILULATE STOPWATCH
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s to start");
		char n=sc.next().charAt(0);
		if(n=='s' || n=='S')
		{
			LocalTime l=java.time.LocalTime.now();
			int h=l.getHour();
			int m=l.getMinute();
			int s=l.getSecond();
			System.out.println(l);
			
			
			System.out.println("Enter e to stop");
			char z=sc.next().charAt(0);
			LocalTime l1=java.time.LocalTime.now();
			if(z=='e'||z=='E') 
			{
				int h1=l1.getHour();
				int m1=l1.getMinute();
				int s1=l1.getSecond();
				System.out.println("StopWatch stopped :"+l1);
				int hour=h-h1;
				int minute=m-m1;
				int second=s-s1;
				
				System.out.println("Time taken :"+hour+":"+minute+":"+second);
			}
			
			
		}
		
		
		
		
		
		
	}
}
