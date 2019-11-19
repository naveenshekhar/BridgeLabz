package com.bridgelabz.algorithm;

public class RegEx {
	public static void main(String[] args) {
		String s = "Hello <<name>>, We have your full name as <<full name>> in our system. \n your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		String name = "Naveen";
		String fname = "Naveen Shekhar";
		String phone = "9693251300";
		s = s.replace("<<name>>", name);
		s = s.replace("<<full name>>", fname);
		s = s.replace("xxxxxxxxxx", phone);
		s = s.replace("01/01/2016", "18/11/2019");
		System.out.println(s);
	}
}
