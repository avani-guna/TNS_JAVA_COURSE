package inheritance;



public class BankAccount_Main {
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount(5000);
		sa.withdraw(1000);
		sa.deposit(1500);
		sa.withdraw(5500);
		sa.withdraw(100);
	}
	

}
