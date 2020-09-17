package shop;

import java.util.Iterator;

public class CompositeBestForOwnerPricingStrategy extends CompositePricingStrategy{
	public int getTotal(Order order) {
		int highestTotal = Integer.MIN_VALUE;
		
		for(Iterator<IOrderPricingStrategy> i = strategies.iterator(); i.hasNext();) {
			IOrderPricingStrategy strategy = (IOrderPricingStrategy)i.next();
			int total = strategy.getTotal(order);
			if(total<highestTotal) {
				highestTotal = total;
			}
		}
		return highestTotal;
	}
}