package com.qa.main;

import java.util.Random;

public class IfStatements {

		// Conditionals are statements
	
		// if a variable is a certain value
		// do a thing
		// else do another thing
	
		public static void demoIf() {
			
			//java uses if statements (like basically every programme)
			//computing / programming is binary true / false
			
			boolean isKettleOn = true;
			
			// if is the command word
			// next to if within () is the statement
			// = assignment
			// == comparison (checking the value)
			if (isKettleOn == true) {
				// is the body
				// what the code does if the statemnt is true
				System.out.println("I'll take milk no sugar!");
			//} else if (isKettleOn == false) {
			//	System.out.println("Pop the kettle on!");
			}
			
			else {
				System.out.println("Pop the kettle on!");
			}
			
			boolean binsOut = true; 

	 		String dayOfTheWeek = "Tuesday";

	 		if(binsOut) {
	 			System.out.println("Bins are out!");
	 		} else {
	 			System.out.println("Bins were forgotten :(");
	 		}

	 		if(dayOfTheWeek == "Tuesday") {
	 			binsOut = false;
	 			System.out.println("It is tuesday!");
	 		}
	 		
		}
	 		
	 	// Conditional Operators 
	 	// == - equals 
	 	// > - greater than
	 	// < - less than 
	 	// <= - less than OR equals 
	 	// >= - greater than OR equals
	 	// || - OR 
	 	// && - AND
	 	// != - not equals
			
			// Task - Using Java IF Else create an if else stack that does the following:
			// - Prints out "Greater than" if a number is greater than 10
			// - Prints out "Equals" if a number is equal to 10
			// - Prints out "less than" if a number is less than 10
		
	 	public static void numChecker() {
	 		
	 		int checkNum = new Random().nextInt(20);
			
	 		if (checkNum > 10) {
	 			System.out.println("Greater than");
	 		}
	 		if (checkNum == 10) {
	 			System.out.println("Equals");
	 		}
	 		if (checkNum < 10) {
	 			System.out.println("Less than");
	 		}
	 	
	 	}

	 	public static void complexStatement() {

	 		boolean bool = true;
	 		String colour = "Red";

	 		// if bool is true OR if colour is red
	 		if (bool == true || colour == "Red") {
	 			System.out.println("bool is true OR colour is red");
	 			// How can I tell whether its bool being true OR colour being red that triggered this?

	 			// Single if else block (which only prints out 1 thing)
	 			if (bool == true && colour == "Red") {
	 				System.out.println("bool is true AND colour is red");
	 			} else if(bool == true) {
	 				System.out.println("bool is true and colour is not red");
	 			} else if (colour == "Red") {
	 				System.out.println("colour is red and bool is not true");
	 			} 

	 			System.out.println("================================");

	 			// Seperate if statements, which MAY print out all 3
	 			if (bool == true && colour == "Red") {
	 				System.out.println("bool is true AND colour is red");
	 			} 

	 			if(bool == true) {
	 				System.out.println("bool is true and colour is not red");
	 			} 

	 			if (colour == "Red") {
	 				System.out.println("colour is red and bool is not true");
	 			} 

	 	}
}