package org.differentpackage;
import org.javaProgram.CourseDetails;

public class Sample {
public void companyName() {
	System.out.println(" Citi Bank");
}

public void clientName() {
	System.out.println(" Xorient ");
}
public static void main(String[] args) {
 
	Sample objName = new Sample();
	objName.clientName();
	objName.companyName();
	
	CourseDetails objName2 = new CourseDetails();
	objName2.oracleCourse();
	objName2.javaCourse();
}
}
