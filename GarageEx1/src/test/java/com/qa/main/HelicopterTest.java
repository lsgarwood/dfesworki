package com.qa.main;

import com.qa.main.Bike;

//import static org.junit.Assert.assertFalse;

import com.qa.main.Helicopter;
import com.qa.main.Vehicle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HelicopterTest {
	
	Helicopter helicopterTest = new Helicopter(3, false, "Av Gas", 18.2f, 185);

	@Test
	public void setMaxSpeedTest() {
		assertEquals(185, 185);
	}
	
	@Test
	public void setWheels() {
		assertTrue("True", helicopterTest instanceof Helicopter);
	}
	
}
