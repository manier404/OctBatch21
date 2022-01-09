package org.var;

public class Client {

	static int i =10;
	public static void getID() {
		System.out.println(i);
		
	}
	public void getAge() {
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		Client obj = new Client();
		obj.getAge();
		obj.getID();//not needed  interms of static method
		getID();

	}

}
