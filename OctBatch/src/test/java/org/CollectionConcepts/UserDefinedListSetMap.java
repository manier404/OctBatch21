package org.CollectionConcepts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedListSetMap extends EmployeeDetails {

	public static void main(String[] args) {
		// 1. employee details
		EmployeeDetails empOneDetail = new EmployeeDetails();
		empOneDetail.setEmpId(10);
		empOneDetail.setEmpName("Manivannan");
		// 2. employee details
		EmployeeDetails empTwoDetail = new EmployeeDetails();
		empTwoDetail.setEmpId(20);
		empTwoDetail.setEmpName("Deepika");
		// 3. employee details
		EmployeeDetails empThreeDetail = new EmployeeDetails();
		empThreeDetail.setEmpId(30);
		empThreeDetail.setEmpName("asdfadsf");
		List<EmployeeDetails> li = new ArrayList<EmployeeDetails>();
		li.add(empOneDetail); //id1, name1
		li.add(empTwoDetail); //id2, name2
		li.add(empThreeDetail); //id3, name3
		System.out.println("User Defined List");
		System.out.println("*****************");
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Employee ID :"+li.get(i).getEmpId());
			System.out.println("Employee Name :"+li.get(i).getEmpName());
		}
		Set<EmployeeDetails> se = new LinkedHashSet<EmployeeDetails>();
		se.add(empOneDetail);
		se.add(empTwoDetail);
		se.add(empThreeDetail);
		System.out.println("User Defined Set");
		System.out.println("*****************");
		for (EmployeeDetails Y : se) {
			System.out.println("Employee ID :"+Y.getEmpId());
			System.out.println("Employee Name :"+Y.getEmpName());
		}
		Map<Integer, EmployeeDetails> mp = new LinkedHashMap<Integer,EmployeeDetails>();
		mp.put(1, empOneDetail); //key-->ref1 ;  value -->id1, name1
		mp.put(2, empTwoDetail);  //key-->ref2 ;  value -->id2, name2
		mp.put(3, empThreeDetail);  //key-->ref3 ;  value -->id3, name3
		System.out.println("User Defined Map");
		System.out.println("*****************");
		Set<Entry<Integer, EmployeeDetails>> entrySet = mp.entrySet();
		for (Entry<Integer, EmployeeDetails> X : entrySet) {
			
			System.out.println("Employee ID :"+X.getValue().getEmpId());
			System.out.println("Employee Name :"+X.getValue().getEmpName());
			System.out.println("Map Key :"+X.getKey());
		}
	}

}
