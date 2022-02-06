package org.testngframework;

import org.testng.annotations.Test;

public class ThreadCount {
@Test
private void testOne() {
System.out.println("Test one Thread Count :"+Thread.currentThread().getId());
}
@Test
private void testTwo() {
	System.out.println("Test Two Thread Count :"+Thread.currentThread().getId());
}
@Test
private void testThree() {
	System.out.println("Test Three Thread Count :"+Thread.currentThread().getId());

}
}
