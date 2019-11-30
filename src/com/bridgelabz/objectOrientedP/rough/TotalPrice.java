package com.bridgelabz.objectOrientedP.rough;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TotalPrice {
	public static void main(String[] args) {
		long total = 0;
		//long weight = 0;
		long overall = 0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar
					.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json"));
			JSONArray jarr = (JSONArray) obj;
			// System.out.println(jarr);

			for (Object i : jarr) {
				JSONObject jobj = (JSONObject) i;
				long a = (long) jobj.get("weight");
				long b = (long) jobj.get("price");
				total = a * b;
				overall = overall + total;
			}
			System.out.println(overall);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
