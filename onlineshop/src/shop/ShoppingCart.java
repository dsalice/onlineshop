package shop;

import java.util.ArrayList;

import store.Product;
import store.Store;
import user.Customer;

public class ShoppingCart {
	private String customerID;
	private ArrayList<Product> Cproduct = new ArrayList<Product>();

	private int totalAmount;
	private int quantity;
	
	public void ShoppingInit() { 
		this.Cproduct.add(new Product(Store.getCategoryInStore("Candle"), 1249, "orance candle", 7000, "handmade",1));
		this.Cproduct.add(new Product(Store.getCategoryInStore("Candle"), 1250, "yello candle", 7000, "handmade",1));
		this.Cproduct.add(new Product(Store.getCategoryInStore("Defuser"), 2435, "rose defuser", 13000, "handmade",1));
		for(Product i: Cproduct) {
			this.totalAmount += i.getProductPrice();
		}
		for(Product i: Cproduct) {
			this.quantity += i.getProductAmount();
		}
	}
	
	public ShoppingCart(Customer c) {
		this.customerID = c.getCustomerID();
		this.quantity = 0;
		this.totalAmount = 0;
	}

	
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public ArrayList<Product> getCproduct() {
		return Cproduct;
	}

	public void setCproduct(ArrayList<Product> cproduct) {
		Cproduct = cproduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
