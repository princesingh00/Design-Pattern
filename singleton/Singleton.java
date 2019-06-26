package com.bridgeit.designPattern.singleton;

public class Singleton {

	private static final Singleton single = new Singleton();

	 Singleton() {

	}

	 void method() {
		System.out.println("How are you..?");
	}

	/**
	 * class type
	 * 
	 * @return object
	 */
	public static Singleton getInstance() {
		return single;
	}
}
