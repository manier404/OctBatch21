package org.construct;

public class Employer extends Client {

	public Employer(String Name) {
		
		System.out.println("Employer is Citi"+Name);
	}
public Employer(int id) {
		this("boss");
		System.out.println("Employer id: "+id);
	}
}
