package features;

public class Account {
	
	private static int nAccount = 0;
	private double balance;
	private int agency;
	private int id;
	private Customer owner = new Customer();
	
	//private static int nextAccount = 1;
	
	public Account(int agency){
		if (agency < 0) {
			System.out.println("Agency: " + agency + ". Values lower than 0");
			this.agency = 1;
		} else {
			this.agency = agency;
		}
	/*	nAccount = nextAccount;
		nextAccount++;
		System.out.println("Account °" + nAccount);  */
	nAccount++;
	System.out.println("N°" + nAccount);
	}
	
	public Account(int agency, double balance) {
		this(agency); //referencing first created
		}
	
	protected double getBalance() {
		return balance;
	}

	protected int getAgency() {
		return agency;
	}

	protected int getId() {
		return id;
	}

	protected Customer getOwner() {
		return owner;
	}
	
	protected static int getNAccount() {
		return nAccount;
	}

	protected void setAgency(int agency) {
		if (agency > 0) {
		this.agency = agency;
		} else {
			System.out.println("Error: Negative value not granted");
		}
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected void setOwner(Customer owner) {
		this.owner = owner;
	}

	
	public void toDeposit(double amount) {
	
		this.balance += amount; //this.balance = (this.balance + amount);
	}
	
	public boolean withdrawal (double amount) {
		if (this.balance > amount){
			this.balance -= amount;
			System.out.println("Operation Successful");
			return true;
		} else {
			System.out.println("Operation failed");
			return false;
		}
	}
	
	public boolean transfer (double amount, Account account) {
		if (this.balance >= amount) {
			this.balance -= amount; //this.balance = (this.balance - amount);
			account.toDeposit(amount);
			return true;
		} 
		return false;
	}
}

