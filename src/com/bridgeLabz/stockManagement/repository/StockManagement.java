package com.bridgeLabz.stockManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockManagement {

	public static long TotalShares(Object object, Object object2) {
		long h = (long) object;
		long y = (long) object2;
		long totalindividualshare = h * y;
		// System.out.println("totalindividualshare price:" + totalindividualshare);
		return totalindividualshare;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject();
		obj1.put("Name :", "Reliance");
		obj1.put("NumberOfShare :", new Integer(40));
		obj1.put("priceOfShare :", new Integer(10000));

		JSONObject obj2 = new JSONObject();
		obj2.put("Name :", "TATA");
		obj2.put("NumberOfShare :", new Integer(5000));
		obj2.put("priceOfShare :", new Integer(50));

		JSONArray stock = new JSONArray();
		stock.add(obj1);
		stock.add(obj2);
		// try-with-resources statement.
		try (FileWriter file = new FileWriter(
				"/home/user/eclipse-workspace/oops/src/com/bridgeLabz/stockManagement/Stock.json")) {
			file.write(stock.toJSONString());
			file.close();
			// System.out.println(inventory);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			JSONParser parser = new JSONParser();
			Object parse = parser.parse(
					new FileReader("/home/user/eclipse-workspace/oops/src/com/bridgeLabz/stockManagement/Stock.json"));
			JSONArray JSON = (JSONArray) parse;

			for (Object j : JSON) {
				JSONObject N = (JSONObject) j;
				System.out.println("Name :" + N.get("Name :"));
				System.out.println("Number Of Share :" + N.get("NumberOfShare :"));
				System.out.println("price Of Share :" + N.get("priceOfShare :"));
				System.out.println("totalindividualshare price :"+TotalShares(N.get("NumberOfShare :"), N.get("priceOfShare :")));
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
}
