package com.bridgelabz.spring.dependencyinjection;

public class Student {
	private String name;

//By using Constructor
	public Student(String name) {
		this.name = name;
	}

//Using setter method
	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public void display() {
		System.out.println("Student name is : " + name);
	}

}
