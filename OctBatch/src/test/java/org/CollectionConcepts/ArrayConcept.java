package org.CollectionConcepts;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 20;
		a[2] = 10;
		a[3] = 30;
		a[4] = 40;
		System.out.println(a[4]);
		
		// iteration
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
