package com.bridgelabz.designPattern.structural.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton()
    {
    	
    }
    
    //static block initialization for exception handling
    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
    public static void main(String[] args) {
    	StaticBlockSingleton obj1 = StaticBlockSingleton.getInstance();
    	StaticBlockSingleton obj2 = StaticBlockSingleton.getInstance();
		System.out.println("the address of first reffernce" + obj1.hashCode());
		System.out.println("the address of second reffernce" + obj2.hashCode());
	}
}