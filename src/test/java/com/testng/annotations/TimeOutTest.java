package com.testng.annotations;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test(timeOut = 3000)
	private void searchWatch() throws InterruptedException {
		System.out.println("searchwatch");
		Thread.sleep(500);
	}
	@Test(timeOut = 3000)
	private void searchTv() throws InterruptedException {
		System.out.println("searchTv");
		Thread.sleep(2000);
	}
}
