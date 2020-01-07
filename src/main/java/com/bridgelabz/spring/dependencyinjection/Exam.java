package com.bridgelabz.spring.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DI.xml");

		Student s = context.getBean("student", Student.class);
		s.display();

		Student s1 = context.getBean("student1", Student.class);
		s1.display();

//  Without Spring
		/*
		 * Student s = new Student(); 
		 * s.setName("Sonu"); s.display();
		 */
	}

}
