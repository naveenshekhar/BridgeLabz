package com.bridgelabz.designPattern.structural.singleton;

public class BillPugh {
	private BillPugh() {

	}

	private static class SingletonHelper {
		private static BillPugh instance = new BillPugh();
	}

	public static BillPugh getInstance() {

		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
      
		BillPugh obj1=BillPugh.getInstance();
		BillPugh obj2=BillPugh.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
