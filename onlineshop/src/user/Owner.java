package user;
import management.ManagementController;
import frame.ManagementFrame;

public class Owner {
	private String OwnerID;
	
	public Owner(){
		OwnerID = "123";
	}
	
	public void requestProductManagement(ManagementController newMController) {
		ManagementFrame newManagementFrame = new ManagementFrame();
		
		newMController.requestManagement();
		newMController.controlCreateNewProduct();
		
		String categoryName;
		String productName;
		int productNum;
		int productPrice;
		String productInfo;
		
		categoryName = newManagementFrame.enterProductCategory();
		productName = newManagementFrame.enterProductName();
		productNum = newManagementFrame.enterProductNum();
		productPrice = newManagementFrame.enterProductPrice();
		productInfo = newManagementFrame.enterProductInfo();
		
		newMController.controlEnterProductInfo(categoryName, productName, productNum, productPrice, productInfo);
		newMController.controlRequestCreation();
	}
}
