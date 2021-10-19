package com.qa.main;

public class Operators {
	
	//Operators are functions you can use to change numerical values
	// Add +
	// Sub -
	// Multiply *
	// Divide /
	// Modulus %
	
	// Modulus -> Can be used to see if a number is odd or even
	// any number % 2 = 0 (is even) = 1 (is odd)
	// 15/4 = 3.75
	// 15/4 = 3 remainder 3
	// 15/4 = 3
	// 15%4 = 3
	
	public static int addMethod() {
		int result = 5 + 5;
		return result;
	}
	
	public static int divideMethod() {
		int result = 10 / 3;
		return result;
	}
	
	// This method will take in two numbers, add them and return the value
	public static int addNums(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	
}
