package com.upskillAssignment_2;

public class Assignment_2_9 {
	/*9. Write a program to swap two string variables (Talen, Tech) and display result on the 
     screen. */

	public static void main(String[] args) {
		myProgram();

	}
	public static void myProgram(){
		String a = "Talen";
		String b = "Tech";
		
		String swap = a;
		a = b;
		b = swap;
		
		System.out.println("Swap value a: " + a);
		System.out.println("Swap value b: " + b);
	}

}
