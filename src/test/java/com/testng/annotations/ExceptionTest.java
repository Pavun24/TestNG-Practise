package com.testng.annotations;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions = Exception.class)
	private void test() {
		int i = 10/0;
	}

}
