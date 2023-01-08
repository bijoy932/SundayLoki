package com.upskilljava_5;

public class AbstractClassImplementation extends AbstractClass{

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
