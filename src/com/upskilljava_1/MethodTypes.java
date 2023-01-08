package com.upskilljava_1;

public class MethodTypes {
	
	
	
	/* Types of Methods
	 1.Void Method
	 2.Static Method
	 3.Return Type Method
	 */
	
	public static int hourlyIncome = 55;
	
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.annualIncomeVoid();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		
		weeklyIncomeStatic();
		
	}
	
	//void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
		
	}
	
	//static Methodww2
	public static void weeklyIncomeStatic(){
		int calculateweeklyIncome = hourlyIncome * 40;
		System.out.println("My weekly Income = " + calculateweeklyIncome);
		
	}
	
	//return type Method 
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
}
	
}