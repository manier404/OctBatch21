package org.construct;

public class CourseDetails2 extends CourseDetails {
// to reduce the number of object creation
	
	public CourseDetails2() {
		this(10);
System.out.println("Non-Parameterised-Default Constructor");
	}
	public CourseDetails2(int id) {
		this("ManiBoss");
		System.out.println("Parameterised Constructor: "+id);
		}
	public CourseDetails2(String Name) {
		this(20,"Boss");
		System.out.println("Parameterised Constructor: "+Name);
		}
	
	public CourseDetails2(int id, String Name) {
		super(50);
		System.out.println("Parameterised Constructor: "+Name+id);
		}
	
	public static void main(String[] args) {
		CourseDetails2 objName = new CourseDetails2();
	}

}
