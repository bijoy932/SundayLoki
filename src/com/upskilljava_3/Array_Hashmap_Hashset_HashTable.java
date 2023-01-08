package com.upskilljava_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
	//1. Array store multiple data using index and index start from [0] 
	//2. HashMap store multiple data using key-value pair, implementation of map interface
	//3. HashSet store unordered collection containing unique value, Implementation of set interface
	//4. HashTable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
		
		int age =30;									//Variable
		int[] ageLoki = new int[]{25, 30, 35, 38, 40};	//Array
		
		//Array index			[0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageLoki[2]);
		System.out.println("Total Student : " + ageLoki.length);
		
		
		String[] firstNameLoki = new String[]{"bijoy", "badsha", "arif", "marzan", "rasel,"};
		
		//Array index			[0] [1] [2] [3] [4] [5]
		
		
		System.out.println("Student Name : " + firstNameLoki[4]);
		System.out.println("Total Student : " + firstNameLoki.length);
		
		
		//MultiDimentional Array
		int [][] ageLoki2D = {{25, 30, 38, 40}, //[0][0] [0][1] [0][2] [0][3] [0][4]
							{67, 24, 51}};		//[1][0] [1][1] [1][2] [1][3] [1][4]
		
		System.out.println("Student Age 2D : " + ageLoki2D[0][3]);
		
		//HashMap store multiple data using key-value pair, implementation of map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Anik", 25);
		Student.put("badsha", 31);
		Student.put("bijoy", 33);
		Student.put("arif", 28);
		
		System.out.println("HashMap Student Age : " + Student.get("bijoy"));
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("Washington DC", "USA");
		Capital.put("Dhaka", "Bangladesh");
		Capital.put("Dilli", "India");
		
		
		System.out.println("HashMap Capital : " + Capital.get("Dhaka"));
		
		
		//HashSet store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> Car = new HashSet<String>();
		Car.add("BMW");
		Car.add("Toyota");
		Car.add("Audi");
		Car.add("Ford");
		Car.add("Ford");
		
		System.out.println("Car : " + Car);
		
		
		//HashTable store multiple data using key-value pair,No duplicate but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		}
		
	}


