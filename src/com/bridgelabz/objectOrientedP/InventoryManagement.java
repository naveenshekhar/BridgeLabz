package com.bridgelabz.objectOrientedP;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		JSONParser parser =new JSONParser();
		
		try
		{
			int total;
//Reading the location of json file
			Object obj=parser.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/InventoryManagement.json"));
			
//Creating JSONObject by downcasting Object to convert the Object(obj) into json object
			JSONObject jsonObject=(JSONObject) obj; 
//Extracting json elements present in file
			String name=(String) jsonObject.get("Name");
//Displaying the output
			System.out.println("Name is :"+name);
			
			String weight=(String) jsonObject.get("Weight");
			System.out.println("Weight is :"+weight);
			
			String 	ratePerKG=(String) jsonObject.get("Rate/KG");
			System.out.println("Rate per KG is :"+ratePerKG);
			total=(Integer.parseInt(weight))*(Integer.parseInt(ratePerKG));
			System.out.println("Total price of wheat :"+total);
			
//Loop through Array and print
			JSONArray groceryArray = (JSONArray) jsonObject.get("grocery");
			Iterator<String> iterator = groceryArray.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println("grocery : "+iterator.hasNext());
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
