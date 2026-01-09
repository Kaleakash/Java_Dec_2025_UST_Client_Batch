package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller					// http protocol resources 
public class SimpleController {
	
	// it is use to map the request from client 
	
	// http://localhost:8080/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openPage() {
		System.out.println("I Came Here");
		// coding 
		System.out.println("some logic we can perform before page open");
		return "index";
		//return "welcome";
	}
	
	// http://localhost:8080/about
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String aboutUs() {
		System.out.println("I Came Here");
		// coding 
		System.out.println("some logic we can perform before page open");
		return "aboutUs";
		//return "welcome";
	}
}
