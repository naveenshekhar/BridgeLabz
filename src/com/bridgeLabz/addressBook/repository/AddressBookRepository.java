package com.bridgeLabz.addressBook.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class AddressBookRepository {
	static JSONParser jsonParser = new JSONParser();
	static JSONObject jsonObject = new JSONObject();public class AddressBook {
		public void write(String path, JSONArray jarr) {
			try (FileWriter fw = new FileWriter(path)) {
				fw.write(jarr.toJSONString());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public JSONArray read(String path) {
			JSONArray jarr;
			try (FileReader fr = new FileReader(path)) {
				JSONParser jp = new JSONParser();
				jarr = (JSONArray) jp.parse(fr);
				return jarr;

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}

	}

	static String path = "JsonFile/";

	/*
	 * By using this method we write our user input data into the file as a json
	 * format
	 * 
	 * @param-data - JSONObject
	 * 
	 * @return - null
	 * 
	 */
	public static void writeData(JSONObject obj) {
		try (FileWriter fileWriter = new FileWriter("addressbook.json")) {
			fileWriter.write(obj.toJSONString());
			System.out.println("Data is added to the file!!!\n\n");
			// AddressBookController.menu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads data from json file and
	 * 
	 * @param-type: No Argument
	 * @return-type: JSONObject
	 * 
	 */
	public static JSONObject readData() {
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("addressbook.json"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}

	public static JSONObject readDataNew(File file2) {

		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader(file2));
			return jsonObject;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void writeDataNew(JSONObject jsonObject, File file) {

		try {
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}