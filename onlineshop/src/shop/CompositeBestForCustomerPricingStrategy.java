package shop;

import java.util.Iterator;

public class CompositeBestForCustomerPricingStrategy extends CompositePricingStrategy{
	public int getTotal(Order order) {
		int lowestTotal = Integer.MAX_VALUE;
		
		for(Iterator<IOrderPricingStrategy> i = strategies.iterator(); i.hasNext();) {
			IOrderPricingStrategy strategy = (IOrderPricingStrategy)i.next();
			int total = strategy.getTotal(order);
			if(total<lowestTotal) {
				lowestTotal = total;
			}
		}
		return lowestTotal;
	}
}