package com.qa.main;

import java.util.Random;

public class DiceEx {
	
	//Task - Create methods that return the following dice rolls

	//3 sided dice
	
	public static int threeSided() {
		int result = new Random().nextInt(3);
		result = result + 1;
		return result;
	}
	
	//4 sided dice
	
	public static int fourSided() {
		int result = new Random().nextInt(4);
		result = result + 1;
		return result;
	}
	
	//six sided dice
	
	public static int sixSided() {
		int result = new Random().nextInt(6);
		result = result + 1;
		return result;
	}
	
	//eight sided dice
	
	public static int eightSided() {
		int result = new Random().nextInt(8);
		result = result + 1;
		return result;
	}
	
	//ten sided dice
	
	public static int tenSided() {
		int result = new Random().nextInt(10);
		result = result + 1;
		return result;
	}
	
	//methods that do the following calculations
	//sum of 4 six sided dice
	
	public static int sumFourSix() {
		int dice1 = sixSided();
		int dice2 = sixSided();
		int dice3 = sixSided();
		int dice4 = sixSided();
		int result = dice1 + dice2 + dice3 + dice4;
		return result;
	}
	
	//sum of 2 10 sided dice and 2 3 sided dice
	
	public static int sumTwoTenTwoThree() {
		int dice1 = tenSided();
		int dice2 = tenSided();
		int dice3 = threeSided();
		int dice4 = threeSided();
		int result = dice1 + dice2 + dice3 + dice4;
		return result;
	}
	
	//sum of 1 of each dice
	
	public static int sumOneEach() {
		int dice1 = threeSided();
		int dice2 = fourSided();
		int dice3 = sixSided();
		int dice4 = eightSided();
		int dice5 = tenSided();
		int result = dice1 + dice2 + dice3 + dice4 + dice5;
		return result;
	}

}

// -----

//Stretch goal:
//- sum of 4 six sided dice ignoring the smallest value