/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpose  parent class of factory design pattern
 * @date ->  08:12:2019
 * @FileName Computer.java 
 ***********************************************/
package com.bridgelabz.designPattern.structural.factoryDesignPattern.services;

public abstract class Computer { 
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
