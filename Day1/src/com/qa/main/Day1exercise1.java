package com.qa.main;

public class Day1exercise1 {

	public static void main(String[] args) {
		
        boolean amIHappy = false; // A boolean named amIHAppy is being declared and assigned false
        
        int weight = 20; // weight variable
        String name = "Billy Bob"; // name variable
        Dog goodBoy = new Dog(name, weight); // goodboy variable
        int x = weight - 10; // setting 
        if (x < 15) goodBoy.bark(); // if statement if x is less than 15 goodboy barks
        
        while (x < 3) {
            goodBoy.play(); // while loop if x is less than 3 goodboy plays
        }
        
        int[] numList = {1,2,3,4,5,6};
        System.out.println("How are you");
        System.out.println("My " + name + " is doing great"
                + " how's yours");
        String num = "305"; 
        int z = Integer.parseInt(num);
    }
	
}
