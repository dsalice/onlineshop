package shop;

import java.util.ArrayList;

public abstract class CompositePricingStrategy implements IOrderPricingStrategy{
	protected ArrayList<IOrderPricingStrategy> strategies = new ArrayList<IOrderPricingStrategy>();
	
	public void add(IOrderPricingStrategy s) {
		strategies.add(s);
	}
	
	public abstract int getTotal(Order order);
}



