package inheritance;

public class SavingAccount extends BankAccount{
	
   public SavingAccount(double balance) {
		super(balance);
		
	}

@Override
   public void withdraw(double wamount) {
	if(wamount<=balance && balance>100)
	{
	this.balance=balance-wamount;
	System.out.println("after withdraw amount is:"+balance);
	
    }
	else {
			System.out.println("you can't withdraw  because your balance is lower than withdraw amount");
		}
		
   }

}
