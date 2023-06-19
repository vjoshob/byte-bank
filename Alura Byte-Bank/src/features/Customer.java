package features;

public class Customer {

	private String name;
	private int idCustomer;
	private int cellphoneNumber;
	
	
	protected String getName() {
		return name;
	}
	protected int getIdCustomer() {
		return idCustomer;
	}
	protected int getCellphoneNumber() {
		return cellphoneNumber;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	protected void setCellphoneNumber(int cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}
	
	
	
}
