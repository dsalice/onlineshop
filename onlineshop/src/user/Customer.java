package user;

import shop.OrderController;
import shop.ShoppingCart;
import frame.OrderFrame;

public class Customer {
	private String customerID;
	private String phoneNumber;
	private String emailAddress;
	private ShoppingCart Csc;
	
	public void CustomerInit() {
		this.customerID = "dd1234";
		this.emailAddress = "dd1234@naver.com";
		this.phoneNumber = "010-1234-5678";
		this.Csc = new ShoppingCart(this);
	}
	
	public void requestOrderFormation(OrderController newOController) {
		OrderFrame of = new OrderFrame();
		ShoppingCart sc = new ShoppingCart(this);
		sc.ShoppingInit();
		
		newOController.controllrequestOrder();
		
		String Address = of.setDeliverInfo();
		
		newOController.controllmakingOrder(Address,this,sc);
		int OrderForm = newOController.controllOrderform();
		
		if(OrderForm == 1) {
			newOController.controllPayment();
		}
		
		int OrderComplete = newOController.controllOrderComplete();
		if(OrderComplete == 1) {
			newOController.orderFinishment();
		}
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
