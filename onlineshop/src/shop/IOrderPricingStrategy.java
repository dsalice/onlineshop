package shop;

public interface IOrderPricingStrategy{
	public abstract int getTotal(Order order);
}