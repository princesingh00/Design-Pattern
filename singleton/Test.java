package com.bridgeit.designPattern.singleton;

public class Test {

	public static void main(String args[]) {

		/**
		 * Due to private modifier object is Not creating Singleton s = new Singleton();
		 */

		Singleton object2 = Singleton.getInstance();
		Singleton object1 = Singleton.getInstance();
		Singleton object3 = new Singleton();
		Singleton object4 = new Singleton();
		object1.method();
		System.out.println();

		System.out.println("Singleton Object..");
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());

		System.out.println();
		System.out.println("Non-Singleton Object..");
		System.out.println(object3.hashCode());
		System.out.println(object4.hashCode());
	}
}
