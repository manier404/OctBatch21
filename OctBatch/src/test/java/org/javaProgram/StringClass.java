package org.javaProgram;

public class StringClass {

	public static void main(String[] args) {

		//1. Find the length of String
		String s = "Deepika";
		int stringlength = s.length();
		System.out.println("Length of String :"+stringlength);
		//2. Find the index of String
		int indexOf = s.indexOf('r');
		System.out.println("index of String :"+indexOf);
		//3. pick a char from string
		char charAt = s.charAt(3);
		System.out.println("char of String :"+charAt);
		// 4.convert String To uppercase
		String upperCase = s.toUpperCase();
		System.out.println("Uppercase of String :"+upperCase);
		// 5. convert String To lowercase
		String lowerCase = s.toLowerCase();
		System.out.println("lowercase of String :"+lowerCase);
		//6. to chk string starts with specific value
		boolean startsWith = s.startsWith("r d");
		System.out.println("starts with specific value of String :"+startsWith);
		//7. to chk string ends with specific value
		boolean endsWith = s.endsWith("ka");
		System.out.println("ends with specific value of String :"+endsWith);
		//8.add/join/concat string with new String 
		String s1 = " Ravichandran";
		String addString = s.concat(s1);
		System.out.println("add/join/concat string with new String :"+addString);
		//9. to find out last index position
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("last index of String :"+lastIndexOf);
		//10.replace /change char to another char
		String replace = s.replace('e','#');
		System.out.println("replace char of String :"+replace);
		//11. both String are equal
		String s2 =  " ravichandran";
		boolean equals = s1.equals(s2);
		System.out.println("both String are equal :"+equals);
		//12. ignore uppercase
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println("both String are equal irrespetive of upper case :"+equalsIgnoreCase);
		//13. string value is empty
		boolean empty = s2.isEmpty();
		System.out.println(" String are empty :"+empty);
		//14. trim the string
		String s3 = " Java session";
		String trim = s3.trim();
		System.out.println(" trim the String :"+trim);
		//15.Substring
		String s4 = "Hai welcome to java session";
		System.out.println(s4.length());
		String s5 = s4.substring(4,11);
		System.out.println(" sub String :"+s5);
		String substring = s4.substring(4);
		System.out.println(" sub String :"+substring);
		//16. split
		String[] splitSpace = s4.split("o",8);
		for(int i=0;i<splitSpace.length;i++)
		{
			System.out.println(splitSpace[i]);
		}
		System.out.println("****************");
		String[] splitSpace2 = s4.split(" ");
		for(int i=0;i<splitSpace2.length;i++)
		{
			System.out.println(splitSpace2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
