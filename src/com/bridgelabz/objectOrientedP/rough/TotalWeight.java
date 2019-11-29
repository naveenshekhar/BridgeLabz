package com.bridgelabz.objectOrientedP.rough;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TotalWeight {
	public static void main(String[] args) {
		long total=0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(new FileReader("/home/naveen/git/BridgeLabz/src/com/bridgelabz/objectOrientedP/test2.json"));
			JSONArray jarr = (JSONArray) obj;
			for(Object i:jarr)
			{
				JSONObject jobj=(JSONObject) i;
			    long a=(long)jobj.get("weight");
				total=total+a;
			}
			System.out.println(total);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
