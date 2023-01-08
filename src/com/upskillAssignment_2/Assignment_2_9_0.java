package com.upskillAssignment_2;

import java.util.Scanner;

public class Assignment_2_9_0 {
	/*10. Write a Java program to convert temperature from Fahrenheit to Celsius degree.*/

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the degree of fahrenheit: ");
		double a = s.nextInt();
		s.close();
		myTemparature(a);

	}
	public static void myTemparature(double a){
		double fahrenheit = 0;
		double celcius = (fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.println("The Equivalent of celcius is: ");
		System.out.println(celcius);
	}

}
