/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Hashing Function
 * @Date    : 25:11:2019
 * @File    : HashingFunction.java
 * ***************************************************/

package com.bridgelabz.dataStructure;

import java.io.FileReader;

import com.bridgelabz.dataStructure.base.Hashing;

public class HashingFunction<T> 
{
	public static void main(String[] args) 
	{
		
			Hashing<Integer> nw = new Hashing<Integer>();
			try {
			@SuppressWarnings("resource")
			FileReader file = new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/dataStructure/base/Hashing.txt");
			int i =0;
			String sb = "";
			while((i=file.read())!=-1) {
				sb = sb+(char) i ;
			}
			System.out.println(sb);
			String arrr[] = sb.split(" ");
			int arr[] = new int[arrr.length];
			 for(int j = 0 ; j<arrr.length;j++) {
				 arr[j] = Integer.parseInt(arrr[j]);
			 }
			 for(int k : arr) {
				nw.add(k);
				
			 }
			nw.display();
			}catch(Exception e) {
				System.out.println(e);
			}

		}
	}

