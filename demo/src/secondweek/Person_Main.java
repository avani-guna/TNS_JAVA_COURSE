package secondweek;

import java.util.Scanner;

public class Person_Main {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :" );
		String name=sc.next();
		
		System.out.println("Enter age :" );
		int age = sc.nextInt();
		
		System.out.println("Enter emailid :");
		String email = sc.next();
		
		System.out.println("Enter income :");
		double income = sc.nextDouble();
		
		Person p = new Person();
		p.setAge(age);
		p.setEmail(email);
		p.setIncome(income);
		p.setName(name);
		System.out.println(p.toString());
		p.checkeligibility();
		TaxCalculation tc=new TaxCalculation();
		tc.tac_calculation(p);
	}

}
