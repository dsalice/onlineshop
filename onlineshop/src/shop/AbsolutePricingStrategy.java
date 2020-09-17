package shop;

public class AbsolutePricingStrategy implements IOrderPricingStrategy{
	double discount = 1500;
	@Override
	public int getTotal(Order order) {
		return (int) (order.getPreDiscountTotal() - discount);
	}
}
