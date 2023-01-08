package com.upskillAssignment_2;

public class Assignment_2_8 {
	/*8. Write Java Program to display Factorial of Number 7. */

	public static void main(String[] args) {
		myNumber();

	}

	public static void myNumber(){
		int n = 7;
		int result = 1;
		for(int i = 1; i<= n; i++){
			result = result * i;
		}
		System.out.println("The Factorial of 7 is " + result);
	}
}
