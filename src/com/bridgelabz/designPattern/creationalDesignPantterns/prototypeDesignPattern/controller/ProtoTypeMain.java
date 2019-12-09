/*********************************************
 * @author   Naveen Shekhar
 * @version  1.0
 * @purpous  prototype Structural Design main class
 * @date     08:12:2019
 * @FileName ProtoTypeMain.java
 **********************************************/

package com.bridgelabz.designPattern.creationalDesignPantterns.prototypeDesignPattern.controller;

import java.util.List;

import com.bridgelabz.designPattern.creationalDesignPantterns.prototypeDesignPattern.model.Employees;

public class ProtoTypeMain  {
	
	public static void main(String[] args)
	{
		Employees emps=new Employees();
		emps.loadData();
		
		Employees emp1=(Employees) emps.clone();
		Employees emp2=(Employees) emps.clone();
		List<String> list1=emp1.getEmp();
		list1.add("W");
        List<String> list2=emp2.getEmp();
        list2.remove("Ishwar");
        System.out.println(emps.getEmp());
        System.out.println(list1);
        System.out.println(list2);
	}
}
