package com.qa.main;

public class Calculator {

	//Exercise - Create a new class called 'calculator' add the following methods:
	//	- add
	//	- subtract
	//	- multiply
	//	- divide
	//Each method should take in two ints OR floats and return the result
	
	// This method will take in two numbers, add them and return the value
	public static int addNums(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
			
	// This method will take in two numbers, subtract them and return the value
	public static int subNums(int sub1, int sub2) {
		int result = sub1 - sub2;
		return result;
	}
	
	//This method will take in two numbers, multiply them and return the value
	public static int multNums(int mult1, int mult2) {
		int result = mult1 * mult2;
		return result;
	}
	
	//This method will take in two numbers, divide them and return the value
	public static int divNums(int div1, int div2) {
		int result = div1 / div2;
		return result;
	}

}

