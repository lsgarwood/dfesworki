package com.qa.main;

import com.qa.main.Hatchback;
import com.qa.main.SportsCar;

public class Runner {

	public static void main(String[] args) {
		
		//Create objects of the child classes and run the methods from your main method
		
		Hatchback polo = new Hatchback("Silver", 5, false, 3, false);
		
		polo.makeNoise();
		polo.extraFeature();
		
		SportsCar bondCar = new SportsCar("Black", 2, false, 1.8f, 150);

		bondCar.makeNoise();
		bondCar.makeSpeed();
	}

}
