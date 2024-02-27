package secondweek;

public class TaxCalculation {
	public void tax_calculation(Person p) {
		
		/*	if(p.getAge() > 50 && p.getIncome() >=50000) {
				System.out.println("need to pay tax");
				
			}
			else {
				System.out.println("no need to pay tax");
			} */
			double tax = 0;
			
			if(p.getAge() >18 && p.getIncome()>=50000 && p.getIncome()<80000) {
				tax=p.getIncome()*0.1;
			}
			else if(p.getAge() >18 && p.getIncome()>=80000 && p.getIncome()<=100000) {
				tax=p.getIncome()*0.2;
			}
				
			System.out.println(" you need to tax is : "+tax);
		}

}
