package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class SearchWord 
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr=new FileReader("C:\\Users\\Naveen Shekhar\\eclipse-workspace\\File_IO\\binary.txt");
			BufferedReader br=new BufferedReader(fr);

			String str;     //string for storing the file data
			String s = null; //
			while((str=br.readLine())!=null)
			{
				s = str;
			}
			String arr [] = s.split(" ");
			System.out.println("File data :"+Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("after sorting :"+Arrays.toString(arr));

			// Taking input from user to search in file
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the word");
			String word=scan.nextLine();

			//using Binary search to search the word in file
			int lo=0;
			int hi=arr.length-1;
			while(lo<=hi)
			{
				int mi=(lo+hi)/2;
				if(word.equals(arr[mi]))
				{
					System.out.println("the word present in "+mi+" index number");
					break;
				}
				else if(word.compareTo(arr[mi])<0)
				{
					hi=mi-1;
				}
				else
				{
					lo= mi+1;
				}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}



		}

	}




