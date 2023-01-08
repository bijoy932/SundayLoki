package com.upskilljava_6;

public interface SingletonUse {
	
	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		obj.demo();
	}

}
