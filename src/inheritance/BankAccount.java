package inheritance;

public class BankAccount {
	
	public double balance;
	public double wamount;
	public double damount;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	public void withdraw(double wamount) {
		if(wamount<=balance) {
		this.balance=balance-wamount;
		System.out.println("after withdraw amount is:"+balance);
		}
	}
	public void deposit(double damount) {
		this.balance=balance+damount;
		System.out.println("after deposit amount is:"+balance);;
		
	}

}
