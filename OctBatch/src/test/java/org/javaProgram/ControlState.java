package org.javaProgram;

public class ControlState {

	public static void main(String[] args) {
		int age = 20;
		int height = 100;
		if (age < 5 && height < 500) { // Conditions with AND/OR operator
			System.out.println("Half-Ticket");
		} else {
			System.out.println("Full Ticket");
		}
		int a = 10, b = 20, c = 30;
		if (a > b && a > c) {
			System.out.println("a is the greatest");
		} else if (b > a && b > c) {
			System.out.println("b is the greatest");
		} else {
			System.out.println("c is the greatest");
		}

		switch (8) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 8:
			System.out.println("eight");
			break;
		default:
			System.out.println("zero");
			break;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("value of i :"+i);
			
			for (int j = 0; j < 3; j++) {
				System.out.println("value of j :"+j);
			}
		}
		int an =8;					//	(1)
		do {
		System.out.println(an);		//	(2)
		an++;						//	(3)
		}
		while (an<10);				//	(4)

		for (int i = 0; i < 10; i++) {
			if (i==5) {
				//break;
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("End");
	}

}
