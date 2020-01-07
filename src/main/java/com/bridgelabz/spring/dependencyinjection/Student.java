package com.bridgelabz.spring.dependencyinjection;

public class Student 
{
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
      System.out.println("Student name is "+name);
	}
	

}
