package frame;
import java.util.Scanner;

public class ManagementFrame {
	private Scanner keyboard;
	
	public ManagementFrame() {
		this.keyboard = new Scanner(System.in);
	}
		
	public int enterProductManagementMenu() {		
		System.out.println("원하시는 메뉴를 선택해주세요");
		System.out.println("1. ��� || 2. ��ȸ || 3. ���� || 4. ����");
		int productMenu = keyboard.nextInt();
		keyboard.nextLine();
									
		if(productMenu == 1) {
			return productMenu;
		}else {
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(��ϸ�)");
			return -1;
		}
	}
	
	public String enterProductCategory() {
		System.out.println("��ǰ ī�װ�: ");
		String categoryName = keyboard.nextLine();
		return categoryName;
	}
	
	public int enterProductNum() {
		System.out.println("��ǰ ��ȣ: ");
		int productNum = keyboard.nextInt();
		keyboard.nextLine();
		return productNum;
	}
	
	public String enterProductName() {
		System.out.println("��ǰ��: ");
		String productName = keyboard.nextLine();
		return productName;
	}
	
	public int enterProductPrice() {
		System.out.println("��ǰ ����: ");
		int productPrice = keyboard.nextInt();
		keyboard.nextLine();
		return productPrice;		
	}
	
	public String enterProductInfo() {
		System.out.println("��ǰ ����: ");
		String productInfo = keyboard.next();
		return productInfo;
	}
	
}





