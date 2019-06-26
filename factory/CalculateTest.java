package com.bridgeit.designPattern.factory;

import com.bridgeit.utility.Utility;

public class CalculateTest {

	public static void main(String args[]) {
		System.out.print("Enter First Number : ");
		double num1 = Utility.getDouble();
		System.out.print("Enter Second Number : ");
		double num2 = Utility.getDouble();

		System.out.println("what do you want : ");
		String string = Utility.getString();

		CalculateFactory obj = new CalculateFactory();

		Calculate obj1 = obj.factory(string);

		obj1.calculate(num1, num2);
	}
}
