package features;

public class TestingConstructor {
	public static void main(String [] args) {
		
		Account account1 = new Account(5);
		System.out.println(account1.getAgency());
		
		Account account2 = new Account(3);
		System.out.println(account2.getAgency());
		
		Account account3 = new Account(2);
		System.out.println(account3.getAgency());
		System.out.println(Account.getNAccount());
		
		
	}
}
