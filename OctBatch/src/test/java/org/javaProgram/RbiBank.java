package org.javaProgram;
//partial abstraction
public abstract class RbiBank {
 
	public void savingAccount() {
		//non abstract method
System.out.println("5%");
	}
	public void fixedAccount() {
		//non abstract method
System.out.println("6%");
	}
	public abstract void depositAccount();
		//  abstract method

}
