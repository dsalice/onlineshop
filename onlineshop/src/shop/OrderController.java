package shop;

import user.Customer;
import frame.OrderFrame;
import shop.ShoppingCart;

public class OrderController {
	Order newOrder;
	OrderFrame newOFrame = new OrderFrame();
	Payment newPayment = new Payment();
	
	public OrderController() {
		
	}
	
	public void controllrequestOrder() {
		newOrder = new Order();
	}
	
	public void controllmakingOrder(String addr, Customer customer,ShoppingCart sc) {
		newOrder.makeOrder(addr,customer,sc);
	}
	
	public int controllOrderform() {
		return newOFrame.BuildOrder(newOrder);
	}
	
	public void controllPayment() {
		int payMethod = newOFrame.setPaymentMethod();
		newOrder.setOrderComplete(newPayment.paymentOrder(payMethod));
	}
	
	public int controllOrderComplete() {
		return newOrder.getOrderComplete();
	}
	
	public void orderFinishment() {
		newOFrame.Orderfinish();
	}
}
