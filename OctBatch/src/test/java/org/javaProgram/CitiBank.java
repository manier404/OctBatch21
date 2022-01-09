package org.javaProgram;

public class CitiBank extends ICICIBank{

	@Override
	public void depositSceme(int id) {
		System.out.println(id);
	
	}
	
	public void fixedScheme() {
		System.out.println("7%");

	}
	
	public static void main(String[] args) {
		CitiBank objName = new CitiBank();
		objName.fixedScheme();
		objName.depositSceme(7);
	}

}
