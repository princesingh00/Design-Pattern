package com.bridgeit.designPattern.adapter;

public class PenAdapter implements Pen {

	PilotPen PP = new PilotPen();

	public void write(String str) {
		PP.mark(str);
	}
}