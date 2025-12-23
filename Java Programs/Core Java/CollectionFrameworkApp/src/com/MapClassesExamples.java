package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClassesExamples {

	public static void main(String[] args) {
	//HashMap hm = new HashMap();
		//LinkedHashMap hm = new LinkedHashMap();
		TreeMap hm = new TreeMap();
	hm.put(2, "Raj");
	hm.put(4, "Raj");
	hm.put(1,"John");
		hm.put(3, "Ali");
	hm.put(5, "Bob");
	//hm.put("A", "B");
		hm.put(3, "Raju");
		hm.put(100, 200);
	System.out.println(hm);
	System.out.println("using key we can get the value "+hm.get(2));
	System.out.println("search using keys "+hm.containsKey(4));
	System.out.println("search using values "+hm.containsValue("Bob"));
	
	}

}
