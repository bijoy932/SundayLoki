package com.upskillassignment_1;

public class Assignment_1_4 {
	
	/*A function returns 30, another function returns 50. Write a java program which 
	 will display subtraction value from bigger number to smaller.*/

	
	public static void main(String[] args) {
		
		myFunction();
		myFunction1();
		
		int a = myFunction();
		int b = myFunction1();
		
		System.out.println(b-a);
	}
	
	public static int myFunction(){
		return 30;
	}
	
	public static int myFunction1(){
		return 50;
	}
}
