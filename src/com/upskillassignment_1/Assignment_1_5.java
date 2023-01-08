package com.upskillassignment_1;

public class Assignment_1_5 {
	/*Write a java program which will display name and guestimated age of every students in your class.
	  (write separate method for every student). */
	
	public static void main(String[] args){
		
		problem myobject = new problem();
		myobject.myMethod1();
		
		myMethod2();
		
		int a = myMethod3();
		System.out.println("Age of Z is" + a);		
	}
	public static void myMethod1(){
		int a = 24;
		System.out.println("Age of X is" + a);		
	}
	public static void myMethod2(){
		int a = 25;
		System.out.println("Age of Y is" + a);
	}
	public static int myMethod3(){
		int a = 26;
		return a;
	}

}
