/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpose  Test class for factory design pattern
 * @date     08:12:2019
 * @FileName TestFactory.java 
 ***********************************************/

package com.bridgelabz.designPattern.structural.factoryDesignPattern.test;

import com.bridgelabz.designPattern.structural.factoryDesignPattern.model.ComputerFactory;
import com.bridgelabz.designPattern.structural.factoryDesignPattern.services.Computer;

public class TestFactory 
{
	public static void main(String[] args) 
	{
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);

		
	}

}
