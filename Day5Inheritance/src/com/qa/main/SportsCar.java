package com.qa.main;

public class SportsCar extends Cars {
	
	// Child 1

	// 2 extra fields
	
	private float engineSize;
	private int topSpeed;
	
	// 1 extra method
	
	@Override  
	public void makeNoise() {
		System.out.println("Vroom vroom!");
	}
	
	public void makeSpeed() {
		System.out.println("I go really fast!");
	}

	// Getters and setters
	
	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	// Constructors
	
	public SportsCar(String bodyColour, int numSeats, boolean typeElectric, float engineSize,
			int topSpeed) {
		super(bodyColour, numSeats, typeElectric);
		this.engineSize = engineSize;
		this.topSpeed = topSpeed;
	}
	

}
