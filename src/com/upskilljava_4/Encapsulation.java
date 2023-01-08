package com.upskilljava_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();

		obj.setName("upskill2");
		obj.setSSN(684368486);
		
		System.out.println(obj.getUserName());
		System.out.println(obj.getName());
	}
	
	private String name = "upskill";			//write & read
	private int ssn = 5513584;					//write only
	private String username = "bijoy";		//read only
	
	//Setter Method - name						 //set the data, Write
	public void setName(String value){			
		name = value;
	}
	
	//Getter Method - name		 				//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						 //set the data, Write
		public void setSSN(int value){			
			ssn = value;
		}
	
	//Getter Method - name		 				//get the data, Read
		public String getUserName(){
			return username;
		}
	
}

