package com.upskillAssignment_4;

/*1.	Write a USER PROGRAM using encapsulation that contains the username, password, email, first and last names of a user
of our application. Display the user information in console output. */

public class Assignment_4_1 {

	public static void main(String[] args) {
		Encapsulate e = new Encapsulate();
		e.display();

	}

	private String username = "Juel";
	private String passward = "test";
	private String email = "juel@talentec.com";
	private String first_name = "Bijoy";
	private String last_name = "paul";
	
	void display() {
		System.out.println("Username: " + username);
		System.out.println("Passward: " + passward);
		System.out.println("Email: " + email);
		System.out.println("First_name: " + first_name);
		System.out.println("Last_name: " + last_name);
	}
}
