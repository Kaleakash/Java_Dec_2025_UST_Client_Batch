package com.service;

public class LoginService {

	public boolean checkLoginDetails(String emailid,String password) {
		if(emailid.equalsIgnoreCase("admin@gmail.com") && password.equals("admin@123")) {
			return true;
		}else {
			return false;
		}
	}
	
	public String greet(String emailId) {
		return "Welcome "+emailId;
	}
}
