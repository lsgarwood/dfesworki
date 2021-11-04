package com.qa.main;

import com.qa.main.Bike;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BikeTest {
	
	// Junit 5 - Junit 4
	// @BeforeAll - @BeforeClass : Needs to be a static method, this will run before
	// everything else; here we might set up DB connections, etc.
	// @BeforeEach - @Before : Method to run before every test, this best to setup
	// our prereqs before testing, e.g. create an object.
	// @AfterAll - @AfterClass : A static method, ran at the end of everything; used
	// to disconnect or close down our components e.g. DB.close();/scanner.close();
	// @AfterEach - @After : Method to run after every test, best used to tear-down
	// any allocated resource post test. e.g. clearing a list, etc.
	// @Test - @Test : A method that Junit will run, typically containing an
	// assertion.
	// @Disable - @Ignore : Prevents a test by running

	// Failures notify an invalid test result
	// Errors indicate an unexpected test execution

//	@BeforeClass
//	public static void setupBikeTest() {
//		Bike bikeTest = new Bike(1, true, "Leg power!", "Racer", false, 5);
//	}
	
//	@Test
//	public void fixVehicleTest() {
//		int cost = bikeTest.fixVehicle(50, 5);
//			assertEquals(250, cost);
//	}
	
	@Test
	public void setTypeTest() {
		Bike bikeTest = new Bike(1, true, "Leg power!", "Racer", false, 5);
		assertTrue("Racer", bikeTest instanceof Bike);
	}
	
	@Test
	public void setNumGearsTest() {
		Bike bikeTest = new Bike(1, true, "Leg power!", "Racer", false, 5);
		Assert.assertEquals(5, bikeTest.this.NumGears(0));
	}
	
	@Test
	public void getTypeTest() {
		Bike bikeTest = new Bike(1, true, "Leg power!", "Racer", false, 5);
		
	}
		
}
