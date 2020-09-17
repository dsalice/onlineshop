package management;

import java.util.Calendar;
import store.Product;
import store.Store;

public class Management {
	private int type;
	private Calendar date;
	Product newProduct;
	
	public Management() {
		type = -1;
		date = Calendar.getInstance();
	}
	
	public int getManagementType() {
		return type;
	}
	
	public void setManagementType(int ManagementType) {
		this.type= ManagementType;
	}
	
	public Product getProduct() {
		return newProduct;
	}
	
	public void createNewProduct() {
		newProduct = new Product();
	}
	
	public void enterProductInfo(String categoryName, String productName, int productNum,
			int productPrice, String productInfo) {
		newProduct.setProductCategory(Store.getCategoryInStore(categoryName));
		newProduct.setProductInfo(productInfo);
		newProduct.setProductName(productName);
		newProduct.setProductNum(productNum);
		newProduct.setProductPrice(productPrice);
	}
	
	public void requestCreation() {
		Store.requestProductCreation(newProduct);
	}
}



