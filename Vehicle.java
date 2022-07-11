package com.qa.garage;

public class Vehicle {
	//attributes
	private String brand;
	private String make;
	private int numberOfWheels;
	
	//constructor
	public Vehicle(String brand, String make, int numberOfWheels) {
		
		this.brand = brand; 
		this.make = make;
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
	
	
	
	
//brand getter and setter 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//make getter and setter
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}

//numberOfWheels getter and setter
	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	
	
	

}
