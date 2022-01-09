package org.CollectionConcepts;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {
	public static void main(String[] args) {
		Set<Integer> si = new HashSet(); // random order
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(20);
		System.out.println(si);
	si.remove(20);	
	System.out.println(si);
	boolean c = si.contains(60);	
	System.out.println(c);
	
	// iteration
	for (int i = 0; i <= si.size(); i++) {
		System.out.println(i);
	}
	for (Integer X : si) { //enhanced for loop
		System.out.println(X);
	}
	}
	
}
