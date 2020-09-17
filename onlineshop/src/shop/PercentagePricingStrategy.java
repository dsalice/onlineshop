package shop;

public class PercentagePricingStrategy implements IOrderPricingStrategy{
	float percentage = (float) 0.99;
	@Override
	public int getTotal(Order order) {
		return (int) (order.getPreDiscountTotal() * percentage);
	}
}