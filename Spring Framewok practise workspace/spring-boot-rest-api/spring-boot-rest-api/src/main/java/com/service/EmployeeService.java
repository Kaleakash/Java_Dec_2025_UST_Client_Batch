package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Employee;


@Service
public class EmployeeService {
	List<Employee> listOfEmployees = new ArrayList<Employee>();

	EmployeeService() {
		Employee emp1 = new Employee(100, "Ravi", 14000);
		Employee emp2 = new Employee(101, "Ramesh", 18000);
		Employee emp3 = new Employee(102, "Raj", 16000);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
	}
	public List<Employee> getAllEmployee() {
		return listOfEmployees;
	}
	
	public String storeEmployee(Employee employee) {
		//listOfEmployees.add(employee);		// directly adding. 
		int temp = 0;
		Iterator<Employee> li = listOfEmployees.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			if(emp.getId()==employee.getId()) {
				temp++;
				break;
			}
		}
		if(temp==0) {
			listOfEmployees.add(employee);
			return "Employee record stored";
		}else {
			temp=0;
			return "Employee id must be unique";
		}
	}
}
