package org.javaProgram;

public class CourseDetails { //pascal notation
	public void javaCourse() { //camel notation
		System.out.println(" Java Course ");
	}

	public void oracleCourse() { //camel notation
		System.out.println(" Oracle Course ");
	}
	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		
		CourseDetails objName = new CourseDetails(); //camel notation
		
		objName.javaCourse();
		objName.oracleCourse();
	}
}
