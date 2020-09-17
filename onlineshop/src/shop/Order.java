package shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.text.SimpleDateFormat;

import store.Product;
import user.Customer;

public class Order {
	private int orderCusID;
	private String address;
	private String date;
	private int TotalPayedAmount; // 지불 가격
	private int TotalPayedQuantity;
	private ArrayList<String> OrderproductName = new ArrayList<String>();
	private ArrayList<Integer> OrderproductQuntity = new ArrayList<Integer>();
	private int orderComplete;
	//*********************************************************************************//
	private int preDiscountTotal;
	CompositePricingStrategy ps = (CompositePricingStrategy) new CompositeBestForCustomerPricingStrategy();
	PricingStrategyFactory psf = new PricingStrategyFactory();
	
	public void orderInit() {
		this.orderCusID = 0;
		this.address = " ";
		this.date = " ";
		this.TotalPayedAmount = 0;
		this.TotalPayedQuantity = 0;
		this.orderComplete = 0;
	}
	
	public void makeOrder(String addr,Customer c, ShoppingCart s) {
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Payment payment = new Payment();	

		this.address = addr;
		
		
		for(Product i: s.getCproduct()) {
			this.OrderproductName.add(i.getProductName());
			this.OrderproductQuntity.add(i.getProductAmount());
			//**********************************************//
			this.preDiscountTotal += i.getProductPrice();
			//**********************************************//
			this.TotalPayedQuantity += i.getProductAmount();
		}
		
		TotalPayedAmount = (int) psf.addCustomerPricingStrategy(this, c);
		
		this.date = sdf.format(dt);
		
	}
	
	public CompositePricingStrategy getPricingStrategy() {
		return ps;
	}
	
	public int getPreDiscountTotal() {
		return preDiscountTotal;
	}

	public int getOrderComplete() {
		return orderComplete;
	}

	public void setOrderComplete(int orderComplete) {
		this.orderComplete = orderComplete;
	}

	public ArrayList<String> getOrderproductName() {
		return OrderproductName;
	}

	public void setOrderproductName(ArrayList<String> orderproductName) {
		OrderproductName = orderproductName;
	}

	public ArrayList<Integer> getOrderproductQuntity() {
		return OrderproductQuntity;
	}

	public void setOrderproductQuntity(ArrayList<Integer> orderproductQuntity) {
		OrderproductQuntity = orderproductQuntity;
	}

	public int getOrderCusID() {
		return orderCusID;
	}


	public void setOrderCusID(int orderCusID) {
		this.orderCusID = orderCusID;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalPayedAmount() {
		return TotalPayedAmount;
	}


	public void setTotalPayedAmount(int totalPayedAmount) {
		TotalPayedAmount = totalPayedAmount;
	}


	public int getTotalPayedQuantity() {
		return TotalPayedQuantity;
	}


	public void setTotalPayedQuantity(int totalPayedQuantity) {
		TotalPayedQuantity = totalPayedQuantity;
	}


	

}
