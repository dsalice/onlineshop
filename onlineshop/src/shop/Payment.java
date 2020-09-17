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
		if(paymethod == 1) { //현금
			
			System.out.println("현금거래 결제 요청하였습니다.");
			// CALL PAYMENT SYSTEM WITH 고객정보, 결제방식
			this.Payed = 1; // 결제 결과
			return Payed;
		}else if(paymethod == 2) { //체크카드 직불카드
			
			System.out.println("직불카드 결제 요청하였습니다.");
			// CALL PAYMENT SYSTEM WITH 고객정보, 결제방식
			this.Payed = 1; // 결제 결과
			return Payed;
		}else if(paymethod == 3) { //신용카드
			
			System.out.println("신용카드 결제 요청하였습니다.");
			// CALL PAYMENT SYSTEM WITH 고객정보, 결제방식
			this.Payed = 1; // 결제 결과
			return Payed;
			}else{
				System.out.println("결제 수단이 잘못되었습니다.");
				this.Payed = -1;
				return Payed;
			}
	}
}
