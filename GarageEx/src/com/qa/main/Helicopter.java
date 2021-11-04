package com.qa.main;

 public class Helicopter extends Vehicle {

 //	Each child class should inherit the fields AND have 2 specific fields 
 //	& 1 method from vehicle (override)
 //	getters and setters
 //	constructors

 	private float rotorDiameter;
 	private int maxSpeed;

 	public Helicopter(int numSeats, boolean wheels, String fuelType, float rotorDiameter, int maxSpeed) {
 		super(numSeats, wheels, fuelType);
 		this.rotorDiameter = rotorDiameter;
 		this.maxSpeed = maxSpeed;
 	}

 	@Override
 	public int fixVehicle() {
 		return 200 + maxSpeed;	
 	}

 	public float getRotorDiameter() {
 		return rotorDiameter;
 	}

 	public void setRotorDiameter(float rotorDiameter) {
 		this.rotorDiameter = rotorDiameter;
 	}

 	public int getMaxSpeed() {
 		return maxSpeed;
 	}

 	public void setMaxSpeed(int maxSpeed) {
 		this.maxSpeed = maxSpeed;
 	}

 	@Override
 	public String toString() {
 		return "Helicopter [rotorDiameter=" + rotorDiameter + ", maxSpeed=" + maxSpeed + ", getNumSeats()="
 				+ getNumSeats() + ", isWheels()=" + isWheels() + ", getFuelType()=" + getFuelType() + "]";
 	}


 }	