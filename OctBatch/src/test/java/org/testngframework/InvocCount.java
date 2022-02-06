package org.testngframework;

import org.testng.annotations.Test;

public class InvocCount {
	@Test(invocationCount=2 )
	private void SampleOne() {
	System.out.println("Sample one Thread Count :"+Thread.currentThread().getId());
	}
	@Test
	private void SampleTwo() {
	System.out.println("Sample Two Thread Count :"+Thread.currentThread().getId());
	}
}
