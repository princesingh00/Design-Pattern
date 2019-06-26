package com.bridgeit.designPattern.factory;

public class CalculateFactory {

	public Calculate factory(String type) {
		
		Calculate object = null;
		
		if(type.toLowerCase().equals("add")) {
			object = new Add();
		}
		else if(type.toLowerCase().equals("subtract")) {
			object = new Subtract();
		}
		else if(type.toLowerCase().equals("divide")) {
			object = new Divide();
		}
		else {
			System.out.println("won't do anything..");
		}
		return object;
}
}
