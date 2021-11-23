package com.testng.annotations;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = -2 )
	private void searchLaptop() {
		System.out.println("SearchLaptop");
	}
	@Test(priority = -5)
	private void searchMobile() {
		System.out.println("SearchMobile");
	}
	@Test
	private void searchWatch() {
		System.out.println("SearchWatch");
	}
	@Test(priority = 1)
	private void searchAirpods() {
		System.out.println("SearchAirpods");
	}
	
}
