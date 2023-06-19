package features;

public class EncapsulationTesting {
	public static void main(String[] args) {
		
		Account account = new Account(2);
		Customer customer = new Customer();
		customer.setName("John");
		customer.setIdCustomer(1893725);
		
		account.setOwner(customer);
		
		System.out.println(account.getOwner().getName());
		System.out.println(customer.getName());
	}
}
