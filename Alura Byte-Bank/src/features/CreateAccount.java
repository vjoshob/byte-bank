package features;

public class CreateAccount {
	public static void main (String [] args) {
	
		Account myAccount = new Account(5);
		//myAccount.setBalance(500.00);
		myAccount.toDeposit(200.00);
		System.out.println(myAccount.getBalance());
		
		myAccount.withdrawal(1000.00);
		System.out.println("Account balance: " + myAccount.getBalance()+ "\n");
		
		//---------------------------------------------------------------------
		
		Account lizzAccount = new Account(2);
		lizzAccount.toDeposit(1000);
		System.out.println("First Lizz Balance: " + lizzAccount.getBalance());
		System.out.println("My balance:" + myAccount.getBalance());
		lizzAccount.transfer(300.00, myAccount);
		boolean couldTransfer = lizzAccount.transfer(300.00, myAccount);
		if (couldTransfer) System.out.println("Successful transfer");
		System.out.println("");
		System.out.println("Last Lizz Balance :" + lizzAccount.getBalance());
		System.out.println("My actual balance: " + myAccount.getBalance());
		
		
	}
}
