package com;

import java.io.File;
import java.io.FileInputStream;

public class ByteWiseReadEmployeeData {

	public static void main(String[] args) {
		try {
			File ff = new File("D:\\employee.csv");
			FileInputStream fis = new FileInputStream(ff);
			int data;
			
			while((data = fis.read()) != -1) {	// -1 is equal to EOF
				//System.out.print(data);  // it display data in ASCI format 
				System.out.print((char)data);	// type casting 
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
