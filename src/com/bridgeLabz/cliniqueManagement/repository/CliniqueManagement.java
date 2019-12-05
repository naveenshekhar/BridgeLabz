package com.bridgeLabz.cliniqueManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CliniqueManagement {

	/**
	 * @purpose Writing the data in jsonarray
	 * @param filePath, JSONArray
	 * @param jsonArray
	 */
	public static void writeData(String filePath, JSONArray jsonArray) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(jsonArray.toJSONString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @purpose to read the json data
	 * @param filePath
	 * @return JSONArray
	 */
	public static JSONArray readData(String filePath) {
		JSONArray jsonArray;
		try (FileReader fileReader = new FileReader(filePath)) {
			JSONParser jsonParser = new JSONParser();
			jsonArray = (JSONArray) jsonParser.parse(fileReader);
			return jsonArray;

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
