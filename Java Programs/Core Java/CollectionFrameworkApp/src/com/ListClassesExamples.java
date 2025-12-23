package com;

import java.util.ArrayList;

public class ListClassesExamples {

	public static void main(String[] args) {
	ArrayList al  = new ArrayList();
	System.out.println("size "+al.size());
	al.add(10);
	al.add(10);
	al.add(30);
	al.add(40);		// added at last 
	al.add(20);
	al.add("John");
	System.out.println(al);
	System.out.println("get value using index "+al.get(0));
	al.add(1, 100);  // it add in particular index position 
	System.out.println(al);
	al.set(2, 200);		// replace 2 index position by 200 value
	System.out.println(al);
	al.remove("John");	// remove using value 
	System.out.println(al);	
	Integer i = 10;
	//al.remove(10);		// consider as index it is consider as index 
	al.remove(i);	// consider as integer objects
	}

}
