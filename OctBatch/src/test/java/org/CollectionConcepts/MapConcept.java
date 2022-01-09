package org.CollectionConcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		Map<Integer,String> mp =new HashMap();
		//key-->reference ; value-->data
		mp.put(10, "Java");
		mp.put(20, "Java");
		mp.put(20, "SQL");
		mp.put(30, "Oracle");
		mp.put(40, "Selenium");
		mp.put(50, null);
		mp.put(null, null);
		System.out.println("Map values: "+mp);
		
		//key alone 
		Set<Integer> a = mp.keySet();
		System.out.println("key alone print: "+a);
		//value alone
		Collection<String> values = mp.values();
		System.out.println("print value alone :"+values);
		// iterate in map
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		
		for (Entry<Integer, String> X : entrySet) {
			System.out.println(X.getValue());
			System.out.println(X.getKey());
			System.out.println(X);
		}
		boolean containsKey = mp.containsKey(20);
		boolean containsValue = mp.containsValue("Oracle");
		System.out.println(containsKey);
		System.out.println(containsValue);
			
		}
	}

