package com;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/1;
			System.out.println("result is "+result);
			System.out.println("no exception");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block - close resources ");
		}

	}

}
