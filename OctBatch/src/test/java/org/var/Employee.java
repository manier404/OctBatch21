package org.var;

public class Employee {
	public static int id =10;
		private static void getID() {
			 int id =10;
			//// Local variable
System.out.println("Id value :"+id);
		}
		private void getAge() {
			
			// TODO Auto-generated method stub
			System.out.println("Id value :"+id);
		}
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.getAge();
		obj.getID();
	}

}
