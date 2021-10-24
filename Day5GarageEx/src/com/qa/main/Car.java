package com.qa.main;

public class Car extends Vehicle {

//	Each child class should inherit the fields AND have 2 specific fields
//	& 1 method from vehicle (override)
//	getters and setters
//	constructors
	
	private String colour;
	private int numDoors;

	public Car(int numSeats, boolean wheels, String fuelType, String colour, int numDoors) {
		super(numSeats, wheels, fuelType);
		this.colour = colour;
		this.numDoors = numDoors;
	}
	
	@Override
	public int fixVehicle() {
		return 200 * numDoors + numDoors;	
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", numDoors=" + numDoors + ", getNumSeats()=" + getNumSeats() + ", isWheels()="
				+ isWheels() + ", getFuelType()=" + getFuelType() + "]";
	}

	
	
}


	
