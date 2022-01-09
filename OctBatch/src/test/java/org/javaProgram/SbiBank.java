package org.javaProgram;

public class SbiBank implements FullyAbstract {

	public static void main(String[] args) {
		SbiBank objName = new SbiBank();
		objName.depositAccount();
		objName.fixedAccount();
		objName.savingAccount();
	}

	@Override
	public void savingAccount() {
		System.out.println("5%");		
	}

	@Override
	public void fixedAccount() {
		System.out.println("2%");		
	}

	@Override
	public void depositAccount() {
		System.out.println("5%");		
	}

}
