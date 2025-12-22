package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPrimitiveData {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(3);ll.add(1);ll.add(5);ll.add(4);
		System.out.println("Before Sort");
		for(int n:ll) {
			System.out.print(n+" ");
		}
		System.out.println("");
			Collections.sort(ll);
		System.out.println("After Sort");
		for(int n:ll) {
			System.out.print(n+" ");
		}
	}

}
