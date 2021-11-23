package com.testng.annotations;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setup");
}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	@BeforeClass
	private void url() {
		System.out.println("Url");
	}
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	@Test
	private void searchLaptop() {
		System.out.println("SearchLaptop");
	}
	@Test
	private void searchMobile() {
		System.out.println("SearchMobile");
	}
	@AfterMethod
	private void verifyPage() {
		System.out.println("VerifyHomePage");
	}
	@AfterClass
	private void logout() {
		System.out.println("Logout");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
	






}




