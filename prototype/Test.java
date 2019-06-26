package com.bridgeit.designPattern.prototype;

public class Test implements Cloneable {

	public static void main(String args[]) throws CloneNotSupportedException {

		ShowRoom sr = new ShowRoom();
		sr.setName("prince");
		sr.insertData();
		System.out.println(sr);
		System.out.println();
		
//		sr.getVehicles().remove(2);
		
		ShowRoom sr1 = (ShowRoom) sr.clone();
		sr1.setName("Singh");
		System.out.println(sr1);

	}

}
