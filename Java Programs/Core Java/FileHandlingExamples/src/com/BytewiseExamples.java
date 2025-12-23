package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BytewiseExamples {

	public static void main(String[] args) throws IOException{
		// byte wise 
		// source --> keyboard 
		// destination --> console 
		// System is a pre defined class part of lang package and in is property of InputStream
		// InputStream refer to standard input device ie keyword. 		
//		DataInputStream dis = new DataInputStream(System.in);		// we are ready to take value through keywords using byte 
//		PrintStream ps  = System.out;	// System class contains out property which refer to PrintStream. print stream always refer to standard output device. 
//										// console.
//		//FileOutputStream fos = new FileOutputStream("data.txt");		// override data by default old data get lost. 
//		//FileOutputStream fos = new FileOutputStream("data.txt",true);		// append data
//		FileOutputStream fos = new FileOutputStream("D:\\data1.txt",true);		// append data
//		ps.println("Enter the data");
//		int ch;		// ASCI code are numberical 
//		while( ( ch=dis.read() ) != '@') {
//			//ps.print(ch);		// console it display that character ASCI code 
//			fos.write(ch);		// when we store in file automatically they convert back to character format 
//		}
		
		// copy from one file to another file 
		FileInputStream fis = new FileInputStream("data.txt");
		FileOutputStream fos = new FileOutputStream("output.txt",true);
		int ch;
		while((ch=fis.read()) != -1) { // -1 is EOF (end of the file)
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("file copied");
		
	}

}
