package com.qa.main;

import java.util.ArrayList;

public class Garage {

//	The task is to create a garage class with methods for the following:
//	- ArrayList<Vehicle>
//	- Adding Vehicles to garage
//	- Removing vehicles
//	- Updating vehicles
//	- Reading vehicle
//	- Removing all vehicles
//	- Running vehicle.fixVehicle() custom method

//	Vehicles
//	Vehicle should be a base class (parent) with at least 3 fields
//	Private fields 3, fixVehicle() method, getters and setters, constructors

//	You should create at least 3 child classes extending off of Vehicle
//	(car, bike, helicopter)
//	Each child class should inherit the fields AND have 2 specific fields
	
	//ArrayList<Vehicle>
	
	public static ArrayList<Vehicle> garageList = new ArrayList<> ();
	
		public void addVehicle(Vehicle vehicle) {
			garageList.add(vehicle);
		}
		
		public void removeVehicle(Vehicle vehicle) {
	  		garageList.remove(vehicle); 
		}
		
		public void updateVehicle(int index, Vehicle vehicle) {
	  		garageList.set(index, vehicle);
	  	}
		
		public void getVehicle(int index) {
	  		System.out.println(garageList.get(index));
		}
		
		public void howManyVehicles() {
	  		System.out.println("There are " + (garageList.size()) + " vehicles in the garage");
		}
		
		public void printAllVehicles() {
			System.out.println(garageList);
		}
		
		public void clearAllVehicles() {
	  		garageList.clear();
		}

}
