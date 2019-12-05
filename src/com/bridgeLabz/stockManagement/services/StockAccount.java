package com.bridgeLabz.stockManagement.services;

import java.io.File;

import com.bridgeLabz.stockManagement.model.StockModel;

public interface StockAccount {
	


	void buyShare(double amount, String symbol, File fileWrite);

	void sellShare(double amount, String symbol, File file2);

	void removeCompanyDetails(String symbol);



	void printTransactiolnDetails();

	void addCompanyDetails(File file, StockModel companyDetails);
}