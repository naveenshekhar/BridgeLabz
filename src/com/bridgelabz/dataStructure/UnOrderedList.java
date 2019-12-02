/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Program to  Read the Text from a file, split it into words
 * 			  and arrange it as Linked List. Take a user input to search a Word in the List. 
 *            If the Word is not found then add it to the list,
 *            and if it found then remove the word from the List. In the end save the list into a file
 * @Date    : 28:11:2019
 * @File    : UnOrderedList.java
 * ***************************************************/

package com.bridgelabz.dataStructure;

import java.io.*;

import com.bridgelabz.dataStructure.base.LinkedList;
import com.bridgelabz.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/home/naveen/java files/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("Enter the word you want to search :");
		String search = Utility.sc.next();
		String s;
		String[] words = null;

		s = br.readLine();
		words = s.split(" ");
		for (String word : words) {
			list.add(word);
		}
		fr.close();
		FileWriter fw = new FileWriter("/home/naveen/java files/abc.txt");
		if (list.search(search) == true) {
			System.out.println("removed :" + search);
			list.removeItem(search);
		} else {
			list.add(search);
		}
		list.show();
		int size = list.size();
		for (int i = 0; i <= size; i++) {
			fw.write(list.pop(0) + " ");
		}
		fw.close();
	}
}
