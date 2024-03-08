package com.avani.assignment.employees;

public class Developer extends Employee{
	private String technology;

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Developer [technology=" + technology + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getSalary()=" + getSalary() +  "]";
	}
	

}
