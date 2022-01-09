package org.excep.prg;

public class Employee {

	public static void main(String[] args) throws UserDefinedException {
		String empId = "34234";
		if (!empId.startsWith("12")) {
			throw new UserDefinedException();
			
			
		}
		System.out.println("Employee Belongs to Specific Dept");
	}

}
