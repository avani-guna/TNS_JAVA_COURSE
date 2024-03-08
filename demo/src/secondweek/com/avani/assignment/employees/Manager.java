package com.avani.assignment.employees;

public class Manager extends Employee {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getSalary()=" + getSalary() +  "]";
	}
	
	

}
