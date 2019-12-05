package com.bridgeLabz.stockManagement.services.serviceImplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.stockManagement.model.StockModel;
import com.bridgeLabz.stockManagement.services.StockAccount;
import com.bridgeLabz.stockManagement.services.StockInterface;

public class StockImplementation implements StockAccount {
	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unchecked")
	@Override
	public void add() {
		FileReader fr = null;
		try {
			fr = new FileReader("/home/user/eclipse-workspace/oops/src/com/bridgeLabz/stockManagement/Stock.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONParser jParse = new JSONParser();// jsonparser is used to read json data
		Object obj = null;

		try {
			obj = jParse.parse(fr);
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JSONArray jarray = (JSONArray) obj;
		try {
			FileWriter fw = new FileWriter(
					"/home/user/eclipse-workspace/oops/src/com/bridgeLabz/stockManagement/Stock.json");
			fw.write(jarray.toJSONString());

		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONObject jobj = new JSONObject();

		// New stocks created
		StockModel stocks = new StockModel();

		System.out.println("Enter the name of item :");
		stocks.setStockName(sc.next());
		jobj.put("Name", stocks.getStockName());

		System.out.println("Enter the share price :");
		stocks.setpriceOfShare(sc.nextInt());
		jobj.put("priceof ", stocks.getpriceOfShare());

		System.out.println("Enter the number of share :");
		stocks.setNumberOfShare(sc.nextInt());
		jobj.put("NumberOfShare", stocks.getNumberOfShare());

		jarray.add(jobj);
		System.out.println("Added..!!");

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueOfEachStock() {

	}

	@Override
	public void valueOfTotalStock() {

	}

	@Override
	public void stockReport() {

	}

	@Override
	public void view() {

	}
	/************************************************
	 * 
	 */
	@Override
	public void buyShare(double amount, String symbol, File fileWrite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellShare(double amount, String symbol, File file2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCompanyDetails(String symbol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printTransactiolnDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCompanyDetails(File file, StockModel companyDetails) {
		// TODO Auto-generated method stub
		
	}
}
