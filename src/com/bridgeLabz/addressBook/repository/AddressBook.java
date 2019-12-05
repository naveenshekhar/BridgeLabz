package com.bridgeLabz.addressBook.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {
	public static void write(String path, JSONArray jarr) {
		try (FileWriter fw = new FileWriter(path)) {
			fw.write(jarr.toJSONString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONArray read(String path) {
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
