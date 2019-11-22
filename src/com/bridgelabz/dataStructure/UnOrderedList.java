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

		while ((s = br.readLine()) != null) {
			words = s.split(" ");
			for (String word : words) {
				list.add(word);
			}
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
