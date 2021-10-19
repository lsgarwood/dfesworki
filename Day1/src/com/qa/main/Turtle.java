package com.qa.main;

public class Turtle {
	
	//attributes
	String shellCol;
	boolean doIHaveFlippers = true;
	float shellLength = 0.7f;
	int offspring = 12;
	int speed;
	int age;
	
	public void swim() {
		System.out.println("I splash!");
	}
	
	public void flippers() {
		System.out.println("Flip Flip");
	}
	
	public void speeding(boolean goodMood) {
		if (speed > 20 || goodMood == false) {
			System.out.println("Slow down Turt!");
		} else {
			System.out.println("Swim Turt Swim!");
		}
	}
	
	// Constructors
	public Turtle() {
		
	}
	
	public Turtle(String shellCol, boolean doIHaveFlippers, float shellLength, int offspring, int speed, int age) {
		this.shellCol = shellCol;
		this.doIHaveFlippers = doIHaveFlippers;
		this.shellLength = shellLength;
		this.offspring = offspring;
		this.speed = speed;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Turtle [shellCol=" + shellCol + ", doIHaveFlippers=" + doIHaveFlippers + ", shellLength="
				+ shellLength + ", offspring=" + offspring + ", speed=" + speed + ", age=" + age + "]";
	}


	
}

	
//&& is and, || is or