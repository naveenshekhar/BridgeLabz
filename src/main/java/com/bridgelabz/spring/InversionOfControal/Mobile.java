package com.bridgelabz.spring.InversionOfControal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("IOC.xml");
		Sim s = context.getBean("airtel", Airtel.class);
		s.call();
		System.out.println("Config Loaded");
		
		
		
		
		
//		Sim sim=new Airtel();
//		sim.call();
//		sim.data();
//		
//		
//		Sim sim1=new Jio();
//		sim1.call();
//		sim1.data();
	}

}
