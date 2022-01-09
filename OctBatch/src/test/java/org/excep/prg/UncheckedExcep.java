package org.excep.prg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UncheckedExcep {
	public static void main(String[] args) {
		//Arithmetic Exception
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
try {
	//System.out.println(3/0);
	//Null pointer Exception
	String s = null;
	int length = s.length();
	System.out.println("lenth of String "+length);
} catch (ArithmeticException e) {
	System.out.println("Do not devide by zero");
}
catch (NullPointerException e) {
	System.out.println("String Value is Null");
}
	finally {
		System.out.println("Finally Block");
	}	
		System.out.println("4");
		//Input Mismatch Exception
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int nextInt = sc.nextInt();
		System.out.println("The value of number entered by user: "+nextInt);
		//Array index out of Bound Exception  
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 60;
		System.out.println(a[2]);
		//String Index out of Bound Exception
		String s1 = "welcome";
		System.out.println(s1);
		char charAt = s1.charAt(6);
		System.out.println(charAt);
		//Index out of Bound Excepation
		List<Integer> li = new ArrayList();
		li.add(10);
		Integer integer = li.get(0);
		System.out.println(integer);
		//Number Format Exception
		String s2 = "asasd";
int parseInt = Integer.parseInt(s2);
System.out.println(parseInt);
	}
}