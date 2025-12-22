package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
			try {
			int result = a/b;	
			System.out.println("result is "+result);
			}catch(Exception exp) {
				//System.err.println("I Take Care!");  // custom message 
				//System.err.println(exp.getMessage());		// exception pre defined message 
				System.err.println(exp.toString());	// name of the exception and message 
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
