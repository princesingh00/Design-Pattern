package com.bridgeit.designPattern.prototype;

public class Vehicle {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	String model;
	long price;
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
}
