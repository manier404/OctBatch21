package org.singleton;

public class Employee {
	static Employee Emp;// class level variable with access modifier(Static)

	private Employee() {
		// access specifier as private to avoid more than one obj
	}

	public static Employee getInstance() {

		if (Emp == null) {
			Emp = new Employee();
		}
		return Emp;

	}
	public static void empId() {
	System.out.println("id is 12345");

	}
	public void empName() {
		System.out.println("name  is mani");

	}

	public static void main(String[] args) {
		Employee e = getInstance();
		empId();
		e.empName();

	}

}
