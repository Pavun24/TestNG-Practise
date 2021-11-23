package com.testng.annotations;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	private void searchMobile() {
		System.out.println("SearchMobile");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("SearchLaptop");
	}
	
	@Ignore
	@Test
	private void searchFruits() {
		System.out.println("SearchFruits");
	}
	
	@Test(enabled = false)
	private void searchWatch() {
		System.out.println("SearchWatch");
	}
	
}
