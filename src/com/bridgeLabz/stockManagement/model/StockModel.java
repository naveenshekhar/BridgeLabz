package com.bridgeLabz.stockManagement.model;

public class StockModel {
	private String StockName;
	private int NumberOfShare;
	private int priceOfShare;

	public String getStockName() {
		return StockName;
	}

	public int getNumberOfShare() {
		return NumberOfShare;
	}

	public int getpriceOfShare() {
		return priceOfShare;
	}

	public void setStockName(String name) {
		this.StockName = name;
	}

	public void setNumberOfShare(int share) {
		this.NumberOfShare = share;
	}

	public void setpriceOfShare(int price) {
		this.priceOfShare = price;
	}

}
