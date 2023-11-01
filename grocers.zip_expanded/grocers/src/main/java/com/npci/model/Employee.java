package com.npci.model;

public class Employee {
	
	private int employee_id;
	private String employee_password;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_id, String employee_password) {
		super();
		this.employee_id = employee_id;
		this.employee_password = employee_password;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_password=" + employee_password + "]";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_password() {
		return employee_password;
	}
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	
	

}
