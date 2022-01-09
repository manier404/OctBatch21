package org.var;

public class Company extends Employee {
	public static int id = 20;

	private void getID() {
		int id = 100;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}

	public static void main(String[] args) {
		Company obj = new Company();

		obj.getID();

	}

}
