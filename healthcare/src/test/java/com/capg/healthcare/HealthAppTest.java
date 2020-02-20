package com.capg.healthcare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HealthAppTest {

	@Test
	public void test1() {
		
		
		assertEquals(1, 1);
	}
	
	@Test
	void testGetEid() {
		
		HealthApp app = new HealthApp();
		
		app.setEid(1001);
		
		assertEquals(1001, app.getEid());
	}

}
