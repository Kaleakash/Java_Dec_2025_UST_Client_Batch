package com;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
		if(age<21) {
			//throw new Exception();		throw generic exception 
			throw new Exception("age must be >21");
		}else {
			System.out.println("You can Vote!");
		}
		}catch(Exception e) {
			System.err.println(e.toString());
		}
	}

}
