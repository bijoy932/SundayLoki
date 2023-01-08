package com.upskilljava_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iWhell() {
		System.out.println("My car has 4 Wheel !");
		return 4;
	}

	@Override
	public String iEngine() {
		System.out.println("My car has 4 hp Engine");
		return "5 hp";
	}

}
/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)						
Class						extends				 Class
Abstract Class(+2)   		extends				 Class(-2)
Interface(+2)				implements	  		 Class(-2)
Interface(+2)				extends				 InterfaceZ(+2)			implements	  			 Class(-4)

*/