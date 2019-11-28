/** **************************************************
 * @Author  : Naveen Shekhar
 * @version : 1.0
 * @purpose : Created a JSON file having Inventory Details for Rice,
 * 			  Pulses and Wheats with properties name, weight, price per kg.
 * 			  And read json file using parser.
 * @Date    : 13:11:2019 - 19:11:2019
 * @File    : InventoryManagement.java
 * ***************************************************/
package com.bridgelabz.objectOrientedP;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("Name", "Rice");
		obj.put("weight", new Integer(50));
		obj.put("price", new Integer(70));

		JSONObject obj1 = new JSONObject();
		obj1.put("Name", "Wheat");
		obj1.put("weight", new Integer(50));
		obj1.put("price", new Integer(40));

		JSONObject obj2 = new JSONObject();
		obj2.put("Name", "pulses");
		obj2.put("weight", new Integer(50));
		obj2.put("price", new Integer(120));

		JSONArray inventory = new JSONArray();
		inventory.add(obj);
		inventory.add(obj1);
		inventory.add(obj2);
		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json")) {
			file.write(inventory.toJSONString());
			// System.out.println(inventory);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			JSONParser parser = new JSONParser();
			Object parse = parser
					.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json"));
			JSONArray JSON = (JSONArray) parse;

			for (Object j : JSON) {
				JSONObject N = (JSONObject) j;
				System.out.println("Name :" + N.get("Name"));
				System.out.println("Price :" + N.get("price"));
				System.out.println("Weight :" + N.get("weight"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}