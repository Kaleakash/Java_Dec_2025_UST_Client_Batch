package com.bean;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;		// complex property 

	public void display() {
		System.out.println("Employee class method");
	}
	public Employee() {
		System.out.println("Employee class object created...Empty constructor");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("Employee class object created...parameter constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
}
