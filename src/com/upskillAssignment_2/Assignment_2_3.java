package com.upskillAssignment_2;

public class Assignment_2_3 {
	/*3. Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else*/

	public static void main(String[] args) {
		
		int number = 70;
		if (number>80){
			System.out.println("Wrong information");
		}else if(number<80 && number>60){
			System.out.println("Correct information");
		}else{
			System.out.println("Do It Again");
		}
	}

}
