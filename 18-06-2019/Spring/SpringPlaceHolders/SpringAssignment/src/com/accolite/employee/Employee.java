package com.accolite.employee;

public class Employee {
	private int id;
	private String employeeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee id: " + id + "  Employee name : " + employeeName;
	}

}
