package org.javaProgram;

public class ManiBank extends RbiBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManiBank objName = new ManiBank();
		objName.currentAccount();
		objName.depositAccount();
		objName.fixedAccount();
		objName.savingAccount();
	}
public void currentAccount() {
	System.out.println("4%");
}
	@Override
	public void depositAccount() {
		System.out.println("7%");
		
	}
	@Override
	public void savingAccount() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fixedAccount() {
		// TODO Auto-generated method stub
		
	}

}
