package com.bridgeit.designPattern.adapter;

public class School {

	private Pen p;

	void writeAssignment(String str) {
		p.write(str);
	}

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
}
