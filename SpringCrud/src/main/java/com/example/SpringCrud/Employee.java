package com.example.SpringCrud;

public class Employee {
	private long id;
	private String name;
	private String location;
	private long salary;
	private String email;
	public Employee(long id, String name, String location, long salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
