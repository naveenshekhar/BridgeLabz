package com.bridgelabz.designPattern.structuralDesignPattern.adaptor;


public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}

