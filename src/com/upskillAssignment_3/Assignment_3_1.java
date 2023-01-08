package com.upskillAssignment_3;

import java.util.Scanner;

public class Assignment_3_1 {
	/*1.    Write a class name BankAccount which has savings and checking class. BankAccount class that has a name and an
	   initial amount, which are both set in the constructor. Also, it lets users make deposits. Note that the account name 
	   must be set when an account is created. Demonstrates the account class hierarchy with output of:


	a.    account name: savings
	b.    initial amount: 10000
	c.    new amount after deposit: 15000
	d.    account name: checking
	e.    initial amount: 20000
	f.    new amount after deposit: 26000
	g.    new amount after withdrawal: 23000 */

	public static void main(String[] args) {
		

	}
	
	String accname;
	float amount;
	boolean bool;
	Scanner s = new Scanner(System.in);
	
	Problem1(String accname) {
		this.accname = accname;
		System.out.println("Account Name: " + this.accname);
		System.out.println("Please enter the initial amount for this " + accname + "account: ");
		this.amount = s.nextFloat();
		if(this.amount <= 0){
			bool = false;
		} else {
			System.out.println("Initial amount: " + this.amount);
			bool = true;
		}
		while (bool==false) {
			System.out.println("Invalid Amount! Try Again: ");
			System.out.println("Please enter the Initial Amout for this " + accname + "account: ");
		}
	}

}
