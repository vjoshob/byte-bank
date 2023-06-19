package features;

public class ReferenceTesting3 {
	public static void main(String[] args) {
		
		Account diegoAccount = new Account(3);
		diegoAccount.setOwner(null);
		System.out.println(diegoAccount.getOwner().getName()); 
	}
}
