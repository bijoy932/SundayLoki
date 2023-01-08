package com.upskillAssignment_2;

public class Assignment_2_4 {
	/*4.  Write a for loop upto 500 which will increase the value double every time*/

	public static void main(String[] args) {
		DoubleValueForloop();

	}
public static void DoubleValueForloop(){
	
	int i = 1;
	for(i=1; i>=500; i = i++) {
		System.out.println("Double Value For loop = " + i);
	}
}
}
