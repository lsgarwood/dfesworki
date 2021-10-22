package com.qa.main;

public class ArraysDemo {
	
	// Arrays within Java are collections of data
	 	// Arrays can only contain one data type Strings, ints, booleans, objects 
	 	// Arrays are immutable - can't be changed once they're created
	 	// You can change the VALUES but can't change the data type OR the length 

	 	// Arrays in Java = Train, you can change the customers getting on and off
	 	// but you can't change the length of the train or type of cargo mid journey

	
	public static void arrayDemo() {
		
		//when creating arrays you need to use [] to denote as an array
		// Curly {} brackets surrounding values, commas seperating values
		
		String colour = "Red";
		String[] colourList = {"Blue", "Purple", "Teal", "Yellow"};
		
		System.out.println(colour); //will print red
		System.out.println(colourList); //will print id reference in memory
		System.out.println(colourList[1]); //will print purple
		
		//For loop to access our colours
		for(int i = 0; i < colourList.length; i++) { //print as list on seperate lines
			System.out.println(colourList[i]);
		}	
			
		for(int i = 0; i < colourList.length; i++) { //print as list on same line
			System.out.print(colourList[i] + " ");
		}
		
		//How to manipulate array values
		// colourList[1] = "Purple"
					
		colourList[1] = "Mauve";
		System.out.println();
		System.out.println(colourList[1]);
		
		}
		
		// printing out an array without using a for loop
		//Not as useful, as it will now be a string and cannot access the data
		//String stringArrayPrint = Arrays.toString(colourList);

		//System.out.println(stringArrayPrint);
		
		//Exercise - Create an array of numbers 1 - 10
		//Print out the number * 2 ( 2 -> 4, 3 ->6)
		//Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)
		//Have a second array created with 10 numbers 1,1,1,1,1.. when you square the number from the first array, modify the 2nd array to have the squared number
	
	public static void arrayEx1() {

		int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]*2);
		}
	}
	
	public static void arrayEx2() {
		
		int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < numList.length; i++) {
			int squareArray = numList[i] * numList[i];
			System.out.println(squareArray);
		}
	}
	
	public static void forEachLoop() {
		
		String[] colourList = {"Blue", "Purple", "Teal", "Yellow"};
		
		//create temp variable called newCllour that is equal to it
		for (String newColour : colourList) {
			System.out.println(newColour);
		}
		
	}
}
