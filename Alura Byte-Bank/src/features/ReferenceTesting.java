package features;

public class ReferenceTesting {
	public static void main(String [] args) {
		
		Account firstAccount = new Account(5);
		//firstAccount.setBalance(200.00);
		System.out.println(firstAccount.getBalance());
		
		System.out.println(firstAccount.getOwner().getName());
		
	}
}
