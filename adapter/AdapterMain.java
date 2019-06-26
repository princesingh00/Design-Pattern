package com.bridgeit.designPattern.adapter;

public class AdapterMain {
	
	static Pen p = new PenAdapter();

	public static void main(String[] args) {
		
		School wa = new School();
		wa.setP(p);
		wa.writeAssignment("i m not anymore interested in assignments..");
	}

}
