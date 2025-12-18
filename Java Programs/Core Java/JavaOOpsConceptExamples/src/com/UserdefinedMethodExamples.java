package com;

public class UserdefinedMethodExamples {
	
	// method no passing parameter and no return type 
	static void welcome() {
		System.out.println("User defined method");
	}
	
	// method passing parameter and no return type 
	static void add(int x, int y) {
		int sum = x+y;
		System.out.println("sum of two number is "+sum);
	}
	
	// passing parameter and return type
	static boolean checkLoginDetails(String emailid,String password) {
			if(emailid.equalsIgnoreCase("admin@gmail.com") && password.equals("admin@123")) {
				return true;
			}else {
				return false;
			}
	}
	
	// no passing parameter but return value. 
	static String greet() {
		return "Welcome to My App";
	}
	
	public static void main(String[] args) {
		welcome();
		add(10,20);
		add(100,200);
		add(1,2);
		boolean result1  = checkLoginDetails("ADMIN@gmail.com", "admin@123");
		boolean result2 = checkLoginDetails("admin@gmail.com", "admin12345");
		System.out.println(result1);
		System.out.println(result2);
		String msg = greet();
		System.out.println(msg);
	}

	
}
