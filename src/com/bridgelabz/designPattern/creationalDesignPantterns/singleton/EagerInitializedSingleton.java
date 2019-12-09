package com.bridgelabz.designPattern.structural.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		EagerInitializedSingleton eager = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eager1 = EagerInitializedSingleton.getInstance();
		System.out.println("the address of first reffernce" + eager.hashCode());
		System.out.println("the address of second reffernce" + eager1.hashCode());
	}
}
