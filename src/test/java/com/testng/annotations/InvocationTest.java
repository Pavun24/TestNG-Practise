package com.testng.annotations;

import org.testng.annotations.Test;

public class InvocationTest {
	@Test(invocationCount = 3)
	private void searchMoile() {
		System.out.println("SearchMobile");
	}
	@Test(invocationCount = 2)
	private void searchLaptop() {
		System.out.println("searchLaptop");
	}
	@Test(invocationCount = 5)
	private void searchFruits() {
		System.out.println("SearchFruits");
	}






}

