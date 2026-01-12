package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class SimpleController {

	// http://localhost:8080/say 	: URL 
	
	@GetMapping(value = "say",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "<h2>Welcome to Spring boot rest controller</h2>";
	}
	
	// http://localhost:8080/say 	: URL 
	@GetMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHTML() {
		return "<h2>Welcome to Spring boot rest controller</h2>";
	}
	// http://localhost:8080/employee 
	// {"id":100,"name":"ravi","salary":14000}	json format. 
	
	@GetMapping(value = "employee",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee(100, "Ravi", 14000);
		return emp;
	}
	//http://localhost:8080/employee 
	
	@GetMapping(value = "employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		Employee emp1 = new Employee(100, "Ravi", 14000);
		Employee emp2 = new Employee(101, "Ramesh", 18000);
		Employee emp3 = new Employee(102, "Raj", 16000);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
}



