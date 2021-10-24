package com.qa.main;

public class Hatchback extends Cars {

	// Child 2
	
	// 2 extra fields
	
	private int numDoors;
	private boolean bigBoot;
	
	// 1 extra method
	
	@Override 
	public void makeNoise() {
		System.out.println("Toot toot!");
	}
	
	public void extraFeature() {
		System.out.println("I have a very spacious boot!");
	}

	// Getters and setters
	
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public boolean isBigBoot() {
		return bigBoot;
	}

	public void setBigBoot(boolean bigBoot) {
		this.bigBoot = bigBoot;
	}

	// Constructors
		
	public Hatchback(String bodyColour, int numSeats, boolean typeElectric, int numDoors,
			boolean bigBoot) {
		super(bodyColour, numSeats, typeElectric);
		this.numDoors = numDoors;
		this.bigBoot = bigBoot;
	}
	
}
