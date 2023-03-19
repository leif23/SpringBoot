package com.leif.assignment.models;

public class Item {
// member variable
	public String name;
	public double price;
	
	
	//constructor
	public Item(String name, double price) {
		this.name= name;
		this.price = price;
	}
	
	//Getters and setters 
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void  setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
