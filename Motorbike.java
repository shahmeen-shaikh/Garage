package com.qa.garage;

public class Motorbike extends Vehicle {
	
	private String colour;
	private String transmission;
	private int doors;
	private int make;
	 
	//constructor

	public Motorbike(String brand, String make, int numberOfWheels, String colour, String transmission, int doors, int year) {
		super(brand, make, numberOfWheels);
		this.colour = colour;
		this.transmission = transmission;
		this.doors = doors;
		this.make = year;
		
	}

	
	@Override
	public String toString() {
		return "Motorbike [colour=" + colour + ", transmission=" + transmission + ", doors=" + doors + ", make="
				+ make + "]";
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
			return make;
		}


		public void setYearOfMake(int make) {
			this.make = make;
		}


	public void startEngine() {
		System.out.println("motorbike noise");
		
	}
	
	
}
