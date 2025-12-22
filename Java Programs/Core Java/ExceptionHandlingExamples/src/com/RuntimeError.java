package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {10,20,30,40,50};
			try {
				int result = a/b;	// new ArithmeticException();
				System.out.println("result is "+result);
			}catch(ArithmeticException exp) {
				//System.err.println("I Take Care!");  // custom message 
				//System.err.println(exp.getMessage());		// exception pre defined message 
				System.err.println(exp.toString());	// name of the exception and message 
			}
			System.out.println("executing 2nd try - catch block");
			try {
				int result1 = abc[5];		// new ArrayIndexOutOfBoundsException();
				System.out.println("result1 is "+result1);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(e.toString());
			}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}

}
