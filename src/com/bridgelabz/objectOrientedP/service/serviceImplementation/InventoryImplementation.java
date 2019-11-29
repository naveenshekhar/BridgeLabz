package com.bridgelabz.objectOrientedP.service.serviceImplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.objectOrientedP.model.InventoryModel;
import com.bridgelabz.objectOrientedP.service.InventoryInterface;
import com.bridgelabz.utility.Utility;

public class InventoryImplementation implements InventoryInterface {

	static int price = 0;
	static int total = 0;

	@SuppressWarnings({ "unchecked" })
	@Override
	public void add() {
		try {
//File reader to read the files from inventory and parse them 
//to store in new array .
			FileReader fr = new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json");

			JSONParser jParse = new JSONParser();// jsonparser is used to read json data
			Object obj = jParse.parse(fr);
			JSONArray jarray = (JSONArray) obj;
			FileWriter fw = new FileWriter("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json");
			JSONObject jobj = new JSONObject();

//New inventory created
			InventoryModel inventory = new InventoryModel();

//adding data(name/price/weight) to inventory
			System.out.println("Enter the name of item :");
			inventory.setName(Utility.sc.next());
			jobj.put("Name", inventory.getName());

			System.out.println("Enter the price of item :");
			inventory.setPrice(Utility.sc.nextInt());
			jobj.put("price", inventory.getPrice());

			System.out.println("Enter the Weight of the item :");
			inventory.setWeight(Utility.sc.nextInt());
			jobj.put("weight", inventory.getWeight());

//adding the new data to array
			jarray.add(jobj);
//Rewriting the new Array data to json file	
			fw.write(jarray.toJSONString());
			fw.flush();
			fw.close();
			System.out.println("Added..!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void view() {
		try {
			JSONParser jp = new JSONParser();
			Object parse = jp
					.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json"));
			JSONArray ja = (JSONArray) parse;

			for (Object i : ja) {
				JSONObject jobj = (JSONObject) i;
				System.out.println("Name : " + jobj.get("Name"));
				System.out.println("Price : " + jobj.get("price"));
				System.out.println("weight : " + jobj.get("weight"));
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void remove() {
		try {
			System.out.println("Enter the item name to be removed : ");
			String item = Utility.sc.next();
			boolean result = true;
			FileReader fr = new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json");
			JSONParser jp = new JSONParser();
			JSONArray jarray = (JSONArray) jp.parse(fr);
			for (int i = 0; i < jarray.size(); i++) {
				JSONObject jobj = (JSONObject) jarray.get(i);

				if (item.equals(jobj.get("Name"))) {
					jarray.remove(jobj);
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println("Not found..");
			} else {
				System.out.println("Successful.");
			}
			try (FileWriter fw = new FileWriter(
					"/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json")) {
				fw.write(jarray.toJSONString());
				fw.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JSONArray readFile() {
		try {
			FileReader fw = new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json");
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(fw);
			JSONArray jarr = (JSONArray) obj;

			return jarr;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void parseInventory(JSONObject obj) {
		JSONObject jobj = (JSONObject) obj.get("Inventory");
		String name = (String) jobj.get("Name");
		System.out.println("Name " + name);
		System.out.println("Name  : " + name);
		String Weight = String.valueOf(jobj.get("Weight"));
		System.out.println("Weight: " + Weight);
		String Price = String.valueOf(jobj.get("PricePerKg"));
		System.out.println("Price : " + Price);

	}

	@Override
	public void totalWeight() {
		long total = 0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar
					.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json"));
			JSONArray jarr = (JSONArray) obj;
			for (Object i : jarr) {
				JSONObject jobj = (JSONObject) i;
				long a = (long) jobj.get("weight");
				total = total + a;
			}
			System.out.println(total);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exit() {

	}

	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub

	}

}
