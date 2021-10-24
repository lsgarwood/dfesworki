package com.qa.main;

public class Bike extends Vehicle {

//	Each child class should inherit the fields AND have 2 specific fields
//	& 1 method from vehicle (override)
//	getters and setters
//	constructors
	
	private String type;
	private boolean fixedSpeed;
	private int numGears;

	public Bike(int numSeats, boolean wheels, String fuelType, String type, boolean fixedSpeed, int numGears) {
		super(numSeats, wheels, fuelType);
		this.type = type;
		this.fixedSpeed = fixedSpeed;
		this.numGears = numGears;
		
	}
	
	@Override
	public int fixVehicle() {
			return 50 * numGears;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFixedSpeed() {
		return fixedSpeed;
	}

	public void setFixedSpeed(boolean fixedSpeed) {
		this.fixedSpeed = fixedSpeed;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	@Override
	public String toString() {
		return "Bike [type=" + type + ", fixedSpeed=" + fixedSpeed + ", numGears=" + numGears + ", getNumSeats()="
				+ getNumSeats() + ", isWheels()=" + isWheels() + ", getFuelType()=" + getFuelType() + "]";
	}

}
