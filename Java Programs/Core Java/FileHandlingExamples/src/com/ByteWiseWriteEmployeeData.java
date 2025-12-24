package com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteWiseWriteEmployeeData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// type of character class help to take the value through keyboards 
		
		try {
			File ff = new File("D:\\Employee.csv");	// to check the properties 
			FileOutputStream fos = new FileOutputStream(ff,true);	// data get append. 
			if(ff.length()==0) {
				String header = "Id,Name,Department,Salary\n";
					
					fos.write(header.getBytes());	// header.getBytes converted in byte format and store in file with help of fos object. 
				System.out.println("Header created");
			}else {
				System.out.println("how many record do you want to store");
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
				System.out.println("Plz enter "+(i+1)+" record");
				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the department");
				String departmet  = sc.next();
				System.out.println("Enter the salary");
				float salary = sc.nextFloat();
					String record = id+","+name+","+departmet+","+salary+"\n";
					fos.write(record.getBytes());
				System.out.println("Data stored...");
				}
			}
		}catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
