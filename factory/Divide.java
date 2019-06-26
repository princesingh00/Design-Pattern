package com.bridgeit.designPattern.factory;

public class Divide implements Calculate {

	public void calculate(double num1, double num2) {
		System.out.println("a/b --> " + (num1 / num2));

	}
}
