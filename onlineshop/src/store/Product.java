package store;

import java.util.Scanner;


public class Product {
	private Category productCategory;
	private int productNum;	
	private String productName;
	private int productPrice;
	private String productInfo; 
	private int productAmount;
		
	public Product() {
		this.productCategory = null;
		this.productNum = 5123;
		this.productName = "초기값";
		this.productPrice = 0;
		this.productInfo = "초기값";
		this.productAmount = 0;
	}
	
	public Product(Category category, int productNum, String productName, int productPrice, String productInfo, int productAmount) {
		this.productCategory = category;
		this.productNum = productNum;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
		this.productAmount = productAmount;
	}
	
	public Category getProductCategory() {
		return productCategory;
	}
	
	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
	
	public int getProductNum() {
		return productNum;
	}
	
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductInfo() {
		return productInfo;
	}
	
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	
	public int getProductAmount() {
		return productAmount;
	}
	
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
}

