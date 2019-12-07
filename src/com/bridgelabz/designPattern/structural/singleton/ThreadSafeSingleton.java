package com.bridgelabz.designPattern.structural.singleton;

public class ThreadSafeSingleton 
{
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton()
	{
		
	}
	
	 public static synchronized ThreadSafeSingleton getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }
	    
	
	public static void main(String[] args) 
	{
		ThreadSafeSingleton obj1=ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj2=ThreadSafeSingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
