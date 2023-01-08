package com.upskilljava_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
public static void main(String[] args) {
		
		Constructor obj1 = new Constructor("bijoy", 30);
		System.out.println(obj1.studentAge);
		System.out.println(obj1.studentName);
		
		Constructor obj2 = new Constructor("bijoy");
		System.out.println(obj2.studentName);
		
		Constructor obj = new Constructor(30);
		System.out.println(obj.studentAge);

	}
	
	String studentName;
	int studentAge;
	
	public Constructor(String name, int age){
		studentName=name;
		studentAge=age;
		
	}
	public Constructor(String name){
		studentName=name;
		
	}public Constructor(int age){
		int studentAge;
		
	}

	

}
