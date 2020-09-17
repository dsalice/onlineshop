package management;

import frame.ManagementFrame;

public class ManagementController {
	Management newManagement;
	ManagementFrame newManagementFrame = new ManagementFrame();
	
	public ManagementController() {
		
	}
	
	public Management getManagement() {
		return newManagement;
	}
	
	public void requestManagement() {
		newManagement = new Management();
	}
	
	public void controlCreateNewProduct() {
		newManagement.createNewProduct();
	}
	
	public void controlEnterProductInfo(String categoryName, String productName, int productNum, int productPrice, String productInfo) {
		newManagement.enterProductInfo(categoryName, productName, productNum, productPrice, productInfo);
	}
	
	public void controlRequestCreation() {
		newManagement.requestCreation();
	}
}


