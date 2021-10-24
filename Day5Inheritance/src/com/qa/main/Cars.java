package com.qa.main;

public class Cars {

//	Task - Create a Parent class of any type (animal, car whatever) 
//			with at least 3 fields and 1 simple method
	
	// Fields- private
	
	private String bodyColour;
	private int numSeats;
	private boolean typeElectric;
	
	// Method
	
	public void makeNoise() {
		System.out.println("beep beep!");
	}
	
	// Getters and Setters
	
	public String getBodyColour() {
		return bodyColour;
	}

	public void setBodyColour(String bodyColour) {
		this.bodyColour = bodyColour;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public boolean isTypeElectric() {
		return typeElectric;
	}

	public void setTypeElectric(boolean typeElectric) {
		this.typeElectric = typeElectric;
	}
	
	// Constructor
	
	public Cars(String bodyColour, int numSeats, boolean typeElectric) {
		super();
		this.bodyColour = bodyColour;
		this.numSeats = numSeats;
		this.typeElectric = typeElectric;
		
	}
}
