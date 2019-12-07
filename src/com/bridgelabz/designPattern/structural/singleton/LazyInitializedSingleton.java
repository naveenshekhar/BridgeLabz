package com.bridgelabz.designPattern.structural.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInstanance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazyInitializedSingleton obj1 = LazyInitializedSingleton.getInstanance();
		LazyInitializedSingleton obj2 = LazyInitializedSingleton.getInstanance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}
}
