package com.bridgeit.designPattern.factory;

import com.bridgeit.utility.Utility;

public class FactoryMain {

	public static void main(String args[]) {

		System.out.println("Enter your OS ");
		String str = Utility.getString();
		
		Object obj = OSFactory.getOS(str);
		((OS) obj).system();

	}
}
