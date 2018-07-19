package Assign;

public class Customer {
	private int custId;
	private int billAmount;
	private String custName;
	
	
public Customer(int custId, int billAmount, String custName) {
		super();
		this.custId = custId;
		this.billAmount = billAmount;
		this.custName = custName;
	}



public Customer(int billAmount, String custName) {
	super();
	this.billAmount = billAmount;
	this.custName = custName;
}



public Customer(int custId, int billAmount) {
	this();
	this.custId = custId;
	this.billAmount = billAmount;
}







public Customer() {
	this(123,45000,"ABC");
	this.billAmount=billAmount;
	this.custId=custId;
	this.custName=custName;
}

public void display() {
	System.out.println("Customer ID : "+ custId);
	System.out.println("Customer Name: "+ custName);
	System.out.println("Customer Bill: "+ billAmount);
}



public int getCustId() {
	return custId;
}



public void setCustId(int custId) {
	this.custId = custId;
}



public int getBillAmount() {
	return billAmount;
}



public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}



public String getCustName() {
	return custName;
}



public void setCustName(String custName) {
	this.custName = custName;
}
}




