package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.dataStructure.base.OrderedLinkList;
import com.bridgelabz.utility.Utility;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/dataStructure/base/Orderedlist.txt");
		BufferedReader br = new BufferedReader(fr);
		OrderedLinkList<Integer> oll = new OrderedLinkList<Integer>();
		System.out.println("Enter the word you want to search :");
		int search = Utility.sc.nextInt();
		String s;
		String[] words = null;

		int i = 0;
		s = br.readLine(); // reading the file from a file
		words = s.split(" "); // splitting BY space and storing in String array
		int[] arr = new int[words.length]; // Empty int array
		for (String word : words) // For-Each loop to traverse the String array
		{
			arr[i] = Integer.parseInt(word); // Storing in int array from String array
			i++;
		}
		br.close();

		for (int j : arr) {
			oll.add(j);
		}
		oll.show();
		FileWriter fw = new FileWriter("/home/naveen/git/BridgeLabz/src/com/bridgelabz/dataStructure/base/Orderedlist.txt");
		if (oll.search(search) == true) {
			oll.remove(search);
			System.out.println("Removed :" + search);
		} else {
			System.out.println("Added :" + search);
			oll.add(search);
		}
		oll.show();
		int size=oll.size();
		for(int j=0;j<=size;j++)
		{
			fw.write(oll.pop(0)+" ");
			
		}
		fw.close();
	}

}
