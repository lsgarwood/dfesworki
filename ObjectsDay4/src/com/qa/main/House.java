package com.qa.main;

public class House {

//	Exercise - House
//
//	Create a class with that name Car etc
//
//	Create at least 4 fields and 1 method (syso something..)
//	bedrooms, age, colour, floors, size
//
//	Create a constructor with some values

	private int bedrooms;
	private int age;
	private String colour;
	private int floors;
	private boolean garden;
	private boolean garage;
	
	public void viewHouse() {
		System.out.println("This is my dream house!");
	}
	
//	public House() {
//		bedrooms = 6;
//		age = 200;
//		colour = "powder blue";
//		floors = 3;
//		garden = true;
//		garage = true;
		
//	} 
	
//	same below \/ but able to pass through values

	public House(int bedrooms, int age, String colour, int floors, boolean garden, boolean garage) {
		super();
		this.bedrooms = bedrooms;
		this.age = age;
		this.colour = colour;
		this.floors = floors;
		this.garden = garden;
		this.garage = garage;
	}

//	Task - Add Getters and Setters to your constructor class and make your fields private
//	Then from your main method print out some of the getters and setters
//	Tip - Right Click - > Source -> Generate getters and Setters
	
	
	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "House [bedrooms=" + bedrooms + ", age=" + age + ", colour=" + colour + ", floors=" + floors
				+ ", garden=" + garden + ", garage=" + garage + "]";
	}

}

