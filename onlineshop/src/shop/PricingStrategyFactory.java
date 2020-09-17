package shop;
import shop.Order.*;
import user.*;

public class PricingStrategyFactory {
	static PricingStrategyFactory instance;
	CompositePricingStrategy PricingStrategy;
	
	public static PricingStrategyFactory getInstance() {
		if(instance == null) instance = new PricingStrategyFactory();
		return instance;
	}
	
	public IOrderPricingStrategy getPercentageStrategy() {
		return new PercentagePricingStrategy();
	}
	
	public IOrderPricingStrategy getAbsoluteStrategy() {
		return new AbsolutePricingStrategy();
	}

	public double addCustomerPricingStrategy(Order order, Customer c) {
		// TODO Auto-generated method stub
		PricingStrategy = order.getPricingStrategy();
		
		PercentagePricingStrategy ps = new PercentagePricingStrategy();
		PricingStrategy.add(ps);
		AbsolutePricingStrategy as = new AbsolutePricingStrategy();
		PricingStrategy.add(as);
		
		
		int total = PricingStrategy.getTotal(order);
		
		return total;
	}

}
