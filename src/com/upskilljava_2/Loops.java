package com.upskilljava_2;

public class Loops {
	
	/*
	 Type of loops
	 1. For loop
	 2. While loop
	 3. Do while loop
	 4. Infinite loop
	 */

	public static void main(String[] args) {
		 //ForLoop();
		// ForWhileLoops();
		//DoWhileLoops();		
		//Infiniteloops();
		//NestedLoops();
		
		PracticeForLoop();
//		PracticeForWhileLoop();
//		PracticeDoWhileForLoop();
//		practiceForInfiniteloop();
//		practiceNestedForLoop();

	}

	
	public static void PracticeForLoop(){							//For loop - Do again and again upto upper limit
		
		int i;														//Initialize the variable
		for(i = 10; i<=20; i++){									//Setting lower limit,upper limit,increment or decrement	
			System .out.println("For loops number = " + i);			//Statement"
			
		}
	}
	
	
	public static void PracticeForWhileLoop(){						//While loop - Do again and again upto condition match
		int i =1;													//Initialize the variable
		while(i<=10){												//Setting condition
			System.out.println("While loops number = " + i);		//Statement
			i++;													//increment or decrement
		}
	}
	

	public static void PracticeDoWhileForLoop(){					//Do while loop - Do action then match condition
		int i = 1;													//Initialize the variable
		do{															
			System.out.println("Do while loops number = " + i);		//Statement
			i++;													//increment or decrement
		}while (i<=100);											//Checking condition
	}
	
	
	public static void practiceForInfiniteloop(){					//Infinite loop - never ending loop
		int i = 1;													//Initialize the variable
		for (i=1; ;i++){											//Setting upper limit
			System.out.println("Infinite loop number = " + i);		//Statement
		}
	}
	
	public static void practiceNestedForLoop(){
		
		int i;
		int j;
		
		for (i=1; i<=10; i++){
			for (j=1; j<=10; j++){
				int multiplicationTable = 1 * j;
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
		
		
		
					
	}
	
	public static void ForLoop(){
		int i=2;
		for(i=2; i<=10; i++){
			System.out.println("For Loops Number = " + i);
		}
	}
	
	public static void ForWhileLoops(){
		int i = 1;
		while(i<=10){
			System.out.println("While Loops Number = " + i);
			i++;
		}
	}
	
	public static void DoWhileLoops(){
		int i = 1;
		do{
			System.out.println("Do While Loops Number = " + i);
			i++;
		}while (i<=5);
	}
	
	public static void Infiniteloops(){
		int i = 1;
		for(i=1; ;i++){
			System.out.println("Infinite Loops Number = " + i);
		}		
	}
	public static void NestedLoops(){
		int i;
		int j;
		
		for (i=1; i<=10; i++){
			for(j=1; j<=10; j++){
				int MultiplicationTable = 1 * j;
				System.out.println(MultiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}
	
	
	
}
