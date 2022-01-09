package org.javaProgram;
//ChildClass | SubClass
public class CompanyDetails extends EmployeeDetails {

	public void compName() {
		System.out.println("Company Name is CitiBank");
	}
	public void clientDetails() {
		System.out.println("client Name is Xorient");

	}
	public static void main(String[] args) {
		CompanyDetails objName = new CompanyDetails();
		objName.clientDetails();
		objName.compName();
		objName.empId();
		objName.empName();
		objName.clientAddress();
		objName.clientDomain();
	}

}
