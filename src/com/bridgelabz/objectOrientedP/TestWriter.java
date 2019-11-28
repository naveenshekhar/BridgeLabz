package com.bridgelabz.objectOrientedP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class TestWriter 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		String age=sc.nextLine();
		 JSONObject obj=new JSONObject();
		 while(obj.size()!=0)
		 {
			 obj.put("name", name);
			 obj.put("age", age);
		 }		 
		 try (FileWriter file = new FileWriter("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json")) 
			{
				file.write(obj.toJSONString());
				System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + obj);
			}
	}
}
