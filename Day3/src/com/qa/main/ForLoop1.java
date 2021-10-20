package com.qa.main;

public class ForLoop1 {
	
	// 3 Create a method that can print out the numbers 1-10 10 times each.
	
		public static void countUpToTen() {
			
			for (int i = 1; i <= 10; i++) {
				for (int y = 1; y <= 10; y++)
					System.out.println(y);
			}
		}
	
	// 5 Create a method to print the numbers 1 to 10 as many times as the value of that number.
	// For example; you will print 1 once, and 10 ten times.

	public static void flowChartDemo() {

 		for (int i = 1; i <= 10; i++) {

 			for (int y = 1; y <= i; y++) {
 				System.out.print(i);
 			}
 			
 			System.out.println("");
 		}
 	}

	// Counting For Loops
	
	public static void countDownFromTen() {

		for (int i = 10; i >= 0; i--) {
	 		System.out.println("The value of i is " + i);
	 	}

	 }

	public static void countInFours() {

	 	for (int i = 150; i > 123; i+=4) {
	 		System.out.println("Value of i is " + i);
	 	}

	 }

	public static void countWithParams(int x, int y, int z) {

	 	for (int i = x; i > y; i+=z) {
	 		System.out.println("Value of i is " + i);
	 	}

	}
	//Use a for()-loop to print the numbers 1-100 in words.
	//For example; 1 = one, 100 = one hundred.
	
	

}



