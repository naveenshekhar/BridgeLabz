package com.bridgelabz.objectOrientedP.model;

public class InventoryModel 
{
	private String Name;
	private int price;
	private int weight;
	
	//set and get the values of Name
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	//set and get the values of Price
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//set and get the values of weight
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
