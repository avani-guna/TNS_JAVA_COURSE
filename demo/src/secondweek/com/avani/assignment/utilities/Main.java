package com.avani.assignment.utilities;
import com.avani.assignment.employees.Manager;
import com.avani.assignment.employees.Developer;
public class Main {
	public static void main(String args[]) {
		Manager mg=new Manager();
		mg.setName("Avani");
		mg.setId(101);
		mg.setSalary(500000);
		mg.setDepartment("abc");
		System.out.println(mg.toString());
		Developer d=new Developer();
		d.setName("abc");
		d.setSalary(30000);
		d.setId(1);
		d.setTechnology("java");
		System.out.println(d.toString());
		
		
	}

}
