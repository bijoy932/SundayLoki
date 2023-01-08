package com.upskilljava_6;

public class Singleton {
	
	//Single tone is a class that can have only one object
	
	//private constructor, it prevent any other class from instantiating
	
	private Singleton() {
		
		
	}
	//private static object of the class
	private static Singleton Singletonobj = new Singleton();
	
	public static Singleton getInstance() {
		return Singletonobj;
	}
	
	protected static void demo() {
		System.out.println("Demo method for sungleton class");
	}

}
