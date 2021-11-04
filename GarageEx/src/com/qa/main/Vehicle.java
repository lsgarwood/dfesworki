package com.qa.main;

 public class Vehicle {

 //	Vehicle
 //	Vehicle should be a base class (parent) with at least 3 fields
 //	and a fixVehicle() method
 //	getters and setters
 //	constructors

 	private int numSeats;
 	private boolean wheels;
 	private String fuelType;

 	public Vehicle(int numSeats, boolean wheels, String fuelType) {
 		super();
 		this.numSeats = numSeats;
 		this.wheels = wheels;
 		this.fuelType = fuelType;
 	}

 	public int fixVehicle() {
 		return 200 * numSeats;	
 	}

 		public int getNumSeats() {
 			return numSeats;
 		}

 		public void setNumSeats(int numSeats) {
 			this.numSeats = numSeats;
 		}

 		public boolean isWheels() {
 			return wheels;
 		}

 		public void setWheels(boolean wheels) {
 			this.wheels = wheels;
 		}

 		public String getFuelType() {
 			return fuelType;
 		}

 		public void setFuelType(String fuelType) {
 			this.fuelType = fuelType;
 		}

 	@Override
 	public String toString() {
 		return "Vehicle [numSeats=" + numSeats + ", wheels=" + wheels + ", fuelType=" + fuelType + "]";
 	}

 } 