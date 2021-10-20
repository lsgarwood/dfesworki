package com.qa.main;

import java.util.Random;

public class DoWhile {

	//Task 
	//Make a new method, using the code from the previous loop
	//converting it to a do while loop
	//Attempt to start with a low total than the minimum value across both loops
	
	public static void whileEx() {	
		
		boolean testBool = true;

 		System.out.println("Before Loop");
 		// While testBool is false testbool == false
 		while(!testBool) {
 			System.out.println("Will this ever print??");
 		}

 		System.out.println("After Loop");
		
		// Do While - Will always run Once before checking the code

		// do first with no condition, and a method body
		// followed by our while (with a condition)
		
		do {
			System.out.println("printed from the do while loop");
		} while(!testBool);

	}	
		
}