package features2;

public class Account {
	
	private double balance;
	private int id;
	private int agency;
	Customer owner = new Customer();
	
	
	protected double getBalance() {
		return balance;
	}
	protected int getId() {
		return id;
	}
	protected int getAgency() {
		return agency;
	}
	protected Customer getOwner() {
		return owner;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected void setAgency(int agency) {
		this.agency = agency;
	}
	protected void setOwner(Customer owner) {
		this.owner = owner;
	}
	
	
	
	
	
}
