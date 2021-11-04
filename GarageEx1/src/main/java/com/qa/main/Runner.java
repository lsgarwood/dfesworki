package com.qa.main;

 //import com.qa.main.Car;
 //import com.qa.main.Bike;
 //import com.qa.main.Helicopter;
 //import com.qa.main.Vehicle;
 //import com.qa.main.Garage;

 public class Runner {

 	public static void main(String[] args) {

 //		Create objects of the child classes and run the methods from your main method

 		Garage garage = new Garage();

 		Vehicle Lotus = new Car(2, true, "Petrol", "Yellow", 2);
 		Vehicle astonMartin = new Car(4, true, "Petrol", "Racing Green", 2);

 		System.out.println("Day One:");

 		garage.addVehicle(Lotus);

 		garage.howManyVehicles();
 		garage.printAllVehicles();

 		System.out.println("--------------");

 		System.out.println("Day Two:");

 		Vehicle chopper = new BikeTest(1, true, "Muscle power!", "cruiser", false, 5);
 		Vehicle bmx = new BikeTest(1, true, "Legs!", "stunt bike", false, 0);

 		garage.addVehicle(chopper);
 		garage.addVehicle(bmx);

 		garage.howManyVehicles();
 		garage.printAllVehicles();

 		System.out.println("--------------");

 		System.out.println("Day Three:");

 		Vehicle cobra = new Helicopter(2, false, "Av Gas", 13.4f, 171);
 		Vehicle chinook = new Helicopter(55, false, "Av Gas", 18.2f, 196);

 		garage.addVehicle(cobra);
 		garage.addVehicle(chinook);

 		garage.howManyVehicles();
 		garage.printAllVehicles();

 		System.out.println("--------------");

 		System.out.println("Day Four:");

 		garage.updateVehicle(0, astonMartin);
 		garage.howManyVehicles();
 		garage.printAllVehicles();

 		System.out.println("--------------");


 	}

 }