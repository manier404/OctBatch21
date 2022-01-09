package org.javaProgram;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner refName = new Scanner(System.in);
		
		System.out.println("Enter the Value of Byte : ");
		
		byte inputUser = refName.nextByte();
		
		System.out.println("Value of Byte : "+inputUser);
		
		System.out.println("Enter the Value of integer : ");
		
		int inputInteger = refName.nextInt();

		System.out.println(" Value of integer : "+inputInteger);
		
	System.out.println("Enter the Value of String : ");
		
		String inputStr = refName.nextLine();

		System.out.println(" Value of String : "+inputStr);
		
	System.out.println("Enter the Value of String : ");
		
		String inputString = refName.next();

		System.out.println(" Value of String : "+inputString);
	}

}
