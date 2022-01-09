package org.javaProgram;

public class MethodOverLoading {
	//Type
	public void empDetails(String Name) {
System.out.println("Diffenrent Type Of Argument :"+Name);
	}
	// number of arguments=3
	public void empDetails(String Name,int id, Long phNo) {
		System.out.println("Diffenrent number Of Argument :"+Name+"\n"+id+"\n"+phNo );
	}//Type
	public void empDetails(int id) {
		System.out.println("Diffenrent Type Of Argument :"+id);
	}//order
	public void empDetails(String Name,Long phNo,int id ) {
		System.out.println("Diffenrent order Of Argument :"+Name+"\n"+phNo+"\n"+id);
	}
	public static void main(String[] args) {
		MethodOverLoading objName = new MethodOverLoading();
		objName.empDetails(20);
		objName.empDetails("MAnivannan");
		objName.empDetails("Manivannan", 20, 9893434334l);
		objName.empDetails("Manivannan", 9893434334l, 20);
	}

}
