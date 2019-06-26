package com.bridgeit.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

import com.bridgeit.utility.Utility;

public class ShowRoom implements Cloneable {

	String name;

	List<Vehicle> vehicles = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void insertData() {
		
		System.out.println("Enter number of vehicles ");
		int n = Utility.getInteger();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter vehicle name : ");
			String name = Utility.getString();
			System.out.println("Enter vehicle model : ");
			String model = Utility.getString();
			System.out.println("Enter vehicle price : ");
			int price = Utility.getInteger();

			Vehicle vehicles = new Vehicle();
			vehicles.setName(name);
			vehicles.setModel(model);
			vehicles.setPrice(price);
			getVehicles().add(vehicles);
		}
	}

	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", vehicles=" + vehicles + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
