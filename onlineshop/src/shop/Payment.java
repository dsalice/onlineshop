package shop;


public class Payment {
	
	private int methodOfPayment;
	private int Payed; 
	
	public void Payment() {
		this.methodOfPayment = 0;
		this.Payed = 0;
	}
	
	
	public int paymentOrder(int paymethod) {
		this.methodOfPayment = paymethod;
		if(paymethod == 1) { //����
			
			System.out.println("���ݰŷ� ���� ��û�Ͽ����ϴ�.");
			// CALL PAYMENT SYSTEM WITH ������, �������
			this.Payed = 1; // ���� ���
			return Payed;
		}else if(paymethod == 2) { //üũī�� ����ī��
			
			System.out.println("����ī�� ���� ��û�Ͽ����ϴ�.");
			// CALL PAYMENT SYSTEM WITH ������, �������
			this.Payed = 1; // ���� ���
			return Payed;
		}else if(paymethod == 3) { //�ſ�ī��
			
			System.out.println("�ſ�ī�� ���� ��û�Ͽ����ϴ�.");
			// CALL PAYMENT SYSTEM WITH ������, �������
			this.Payed = 1; // ���� ���
			return Payed;
			}else{
				System.out.println("���� ������ �߸��Ǿ����ϴ�.");
				this.Payed = -1;
				return Payed;
			}
	}
}
