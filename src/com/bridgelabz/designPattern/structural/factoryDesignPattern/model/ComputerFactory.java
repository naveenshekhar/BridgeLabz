/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpose  parent class of factory design pattern
 * @date ->  08:12:2019
 * @FileName ComputerFactory.java 
 ***********************************************/ 
package com.bridgelabz.designPattern.structural.factoryDesignPattern.model;

import com.bridgelabz.designPattern.structural.factoryDesignPattern.services.Computer;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PCModel(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new LaptopModel(ram, hdd, cpu);

		return null;
	}
}
