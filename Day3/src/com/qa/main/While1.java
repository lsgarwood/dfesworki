package com.qa.main;

import java.util.Random;

public class While1 {
	
	//Task - Create a new class and method that do the following:
	//Using a while loop start with a beginning total (300), subtract an amount of money from it (45) until the total goes less than another value (87)
	//When the total goes below the set value, print out "You're spending too much money!"

	public static void firstWhileEx() {
		
		int counter = 300;
		int withdraw = 45;
		
		System.out.println("Startign balance is " + counter);
		
		while (counter >= 87) {
			int balance = counter - withdraw;
			System.out.println("You withdrew " + withdraw + " You now have " + balance);
			counter -= 45;
		}
		
		System.out.println("You're spending too much!");
		
	}	
	
	public static void secondWhileEx() {
	
		int money = 300;
		int withdraw = new Random().nextInt(50);
			 
		while (money >= 87) {
			int balance = money - withdraw;
			System.out.println("You withdrew " + withdraw + ". Your new balance is: " + balance);
			money -= balance;
			
		}
		
		System.out.println("You have reached your spending limit. You're spending too much!");	

	}
}
