package features;

public class ReferenceTesting2 {
	public static void main(String[] args) {
		
		Customer diego = new Customer();
		diego.setName("Diego");
		diego.setIdCustomer(18842764);
		diego.setCellphoneNumber(3547865);
		
		Account diegoAccount = new Account(5);
		diegoAccount.setAgency(1);
		diegoAccount.setOwner(diego);
		
		System.out.println(diegoAccount.getOwner().getIdCustomer());
		System.out.println(diegoAccount.getOwner());
		System.out.println(diego);
		
		
	}
}
