package com.upskillAssignment_2;

public class Assignment_2_5 {
	/*5.  Write a program in Java to display the multiplication table of (eight)8.*/

	public static void main(String[] args) {
		ForTable();

	}
	public static void ForTable(){
		int row =1;
		int column =1;
		
		for (row =1; row<=8; row++){
			for (column=1; column<=8; column++){
				int MultiplicationTable=row*column;
				System.out.print(MultiplicationTable + " ") ;
			}
			System.out.println("");
		}
	}

}
