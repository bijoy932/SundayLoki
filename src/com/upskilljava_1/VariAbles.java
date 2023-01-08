package com.upskilljava_1;

public class VariAbles {

	// Variable in java
	
	public String country = "USA";				//Instance or Global variable- variable declared in class level,outside method
	
	public static String region = "America";	//Static variable - variable belong to class and don,t required creating object
	
	public static void main(String[] args ) {
		
		String city = "New York";			//Local variable - Variable declared in method
		
	}
	
	public void method(String county) {		//Method parameter - Variable used as method parameter
		
		String city = "Bronx";
		
		String myCounty = county;
	}

	
	public void test(){
		
		String city = "Buffalo";
	}
}


//Instance or Global ,  Static variable , Local variable, Method parameter