/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpous  prototype Structural Design main class
 * @date     08:12:2019
 * @FileName Employees.java
 **********************************************/

package com.bridgelabz.designPattern.creationalDesignPantterns.prototypeDesignPattern.model;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> emp;

	public Employees() {
		emp = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.emp = list;
	}

	public void loadData()
	{
		emp.add("Bhagwaan");
		emp.add("Virat");
		emp.add("Suraj");
		emp.add("Ishwar");
		emp.add("Rohit");
		emp.add("Pankaj");
	}
	
	
	public List<String> getEmp()
	{
		return emp;
	}
	
	public Object clone()
	{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmp()){
			temp.add(s);
		}
		return new Employees(temp);

	}
	

}
