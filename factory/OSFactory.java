package com.bridgeit.designPattern.factory;

public class OSFactory  {

	public static OS getOS(String str) {

		if (str.equals("Android")) {
			return new Android();
		} else if (str.equals("Windows")) {
			return new Windows();
		} else if (str.equals("IOS")) {
			return new IOS();
		}
		return null;

	}
}
