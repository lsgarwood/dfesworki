package com.qa.main;

import java.util.Random;

public class While {

	// iteration allows you to repeat blocks of code
	// until a specific condition is met
	
	//Within Java is 4 basic types of loop
	
	//While - Run until a boolean condition is met
	//Do while - runs once and then checks the boolean condition
	
	//For - Run for predetermined (numerical) amount of iterations
			//If you know how many times the loop should run use FOR loop
			//If you don't know use WHILE/DO WHILE
	
	//Switch - Inbetween conditionals and loops, replaces a nesting if statement and loops the code 

	public static void basicDemno() {
		
		int counter = 0;
		
		System.out.println("Loopo beginning");
		//while is the command word
		//next is the query, same as if statement
		while(counter < 20) {
			System.out.println("Counter value: " + counter); //combining string and int
			counter ++; //increment counter by one each time in the loop, (--) decrease by 1
			//counter +=(or-=) 2; would increment (or decrease) by two at a time
		}
		System.out.println("Loop ended");
	}
	
	//Task - Create a new class and method that do the following:
	
	//Using a while loop start with a beginning total (300), subtract an amount of money from it (45) until the total goes less than another value (87)

	//When the total goes below the set value, print out "You're spending too much money!"

	public static void whileEx() {
		
		int counter = 300;
		int withdraw = new Random().nextInt(50);
		 
		while (counter >= 87) {
			int balance = counter - withdraw;
			System.out.println("You withdrew " + withdraw + ". Youre new balance is: " + balance);
			
		
		System.out.println("Youre spending too much!");
		}
	}
}