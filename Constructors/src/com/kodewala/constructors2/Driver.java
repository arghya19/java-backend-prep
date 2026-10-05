package com.kodewala.constructors2;

class Invoice{
	int invoiceId;
	String itemName;
	int amount;
	String billingAddress;
	String customerId;
	String customerName;
	
	static int gstNo = 18;
	
	Invoice(int _invoiceId, String _itemName, int _amount,String _billingAddress, String _customerId, String _customerName) {
		this.invoiceId = _invoiceId;
		this.itemName = _itemName;
		this.amount = _amount;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Invoice inv1 = new Invoice(101, "Iphone 18 pro", 180000, "Bangalore", "C1001", "xyz");
		System.out.println("Invoice 1: \n"+ "Invoice Id: "+inv1.invoiceId+"\nItem Name: "+inv1.itemName+"\nCustomerId: "+inv1.customerId+"\nCustomer Name: "+inv1.customerName);

	}

}
