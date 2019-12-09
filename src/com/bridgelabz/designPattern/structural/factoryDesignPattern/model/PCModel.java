/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpose  child class of factory design pattern
 * @date ->  08:12:2019
 * @FileName PCModel.java 
 ***********************************************/ 

package com.bridgelabz.designPattern.structural.factoryDesignPattern.model;

import com.bridgelabz.designPattern.structural.factoryDesignPattern.services.Computer;

public class PCModel extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PCModel(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

}
