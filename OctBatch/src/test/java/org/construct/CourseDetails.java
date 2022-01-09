package org.construct;

public class CourseDetails {

	public CourseDetails() {

	System.out.println("Non-Parameterised-Default Constructor");
	}
	public CourseDetails(int id) {

		System.out.println("Parameterised Constructor"+id);
		}
	public void CourseDetails() {

		System.out.println("Normal Method");
		}
	public static void main(String[] args) {
	
		CourseDetails objName = new CourseDetails();
		CourseDetails objName2 = new CourseDetails(10);
		objName2.CourseDetails();
		
	}

}
