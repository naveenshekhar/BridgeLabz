package com.bridgelabz.objectOrientedP;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CrunchifyJSONFileWrite {
 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException 
	{
 
		JSONObject obj = new JSONObject();
		obj.put("Name", "crunchify.com");
		obj.put("Author", "App Shah");
 
		JSONArray company = new JSONArray();
		company.add("Compnay: eBay");
		company.add("Compnay: Paypal");
		company.add("Compnay: Google");
		obj.put("Company List", company);
 
		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("/Users/<username>/Documents/file1.txt")) 
		{
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
	}
}