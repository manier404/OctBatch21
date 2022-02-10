package org.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {
	
	@Test
	private void tc1() {
		Assert.assertTrue(true);
		System.out.println("Test Case-1 ");
	}
	@Test (retryAnalyzer=Execute.class)
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("Test Case-2 ");
	}
	@Test
	private void tc3() {
		Assert.assertTrue(false);
		System.out.println("Test Case-3 ");
	}
	@Test (retryAnalyzer=Execute.class)
	private void tc4() {
		Assert.assertTrue(false);
		System.out.println("Test Case-4 ");
	}
	@Test
	private void tc5() {
		Assert.assertTrue(true);
		System.out.println("Test Case-5 ");
	}
}
