package frame;

import java.util.Scanner;

import shop.Order;
import shop.Payment;

public class OrderFrame {
	private Scanner keyboard;
	
	public OrderFrame() {
		this.keyboard = new Scanner(System.in);
	}
		
	public int enterOrdertMenu() {		
		System.out.println("���Ͻô� �޴��� �������ּ���");
		System.out.println("1. �ֹ�");
		int orderMenu = keyboard.nextInt();
		keyboard.nextLine();
									
		if(orderMenu == 1) {
			return orderMenu;
		}else {
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
			return -1;
		}
	}
	
	public String setDeliverInfo() {
		System.out.println("����� �Է����ּ���: ");
		String Address = keyboard.nextLine();
		return Address;
	}
	
	public int BuildOrder(Order order) {
		System.out.println("�ֹ���¥  : "+order.getDate());
		System.out.println("�ֹ���ID :" +order.getOrderCusID());
		
		for(String i : order.getOrderproductName()) {
			System.out.println("["+i+"] �ֹ� ��ǰ : " + i.toString());
		}
		
		System.out.println("�� "+order.getTotalPayedQuantity()+"��, "+order.getTotalPayedAmount()+"�� �Դϴ�.");
		
		System.out.println("�ֹ��� �����ϰڽ��ϱ�? 1. yes, 2. no");
		int buildup = keyboard.nextInt();
		
		if(buildup == 1) {
			return buildup;
		}else {
			System.out.println("�ֹ��� ����ϼ̽��ϴ�.");
			return -1;
		}
	}
	
	public int setPaymentMethod() {
		System.out.println("���� ������ �����ϼ���. 1.�������Ա� , 2.����ī�� , 3.�ſ�ī��");
		int payMethod = keyboard.nextInt();
		
		return payMethod;
	}
	
	public void Orderfinish() {
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
	}
	
}