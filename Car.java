package com.qa.garage;

public class Car extends Vehicle {
	
	private String colour;
	private String transmission;
	private int doors;
	private int yearOfMake;
	
	 
	//constructor
	public Car(String brand, String make, int numberOfWheels, String colour, String transmission, int doors, int year) {
		super(brand,make,numberOfWheels);
		this.colour = colour;
		this.transmission = transmission;
		this.doors = doors;
		this.yearOfMake = year;
	}


	

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", transmission=" + transmission + ", doors=" + doors + ", yearOfMake="
				+ yearOfMake + "]";
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}

	
	
	public int getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	
	
	





}
