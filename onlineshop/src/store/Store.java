package store;

import java.util.ArrayList;
import management.ManagementController;

public class Store {
	private String name = "���м�";
	private String address = "���ִ��б�";
	
	private static ManagementController MController = new ManagementController();
	static ArrayList<Category> categoryL = new ArrayList<Category>();
	static ArrayList<Product> productL = new ArrayList<Product>();
	
	public static ManagementController getManagementController() {return MController;}
	
	public static void StoreInit() {
		categoryL.add(new Category("A", "Candle"));
		categoryL.add(new Category("B", "Defuser"));
		
		productL.add(new Product(categoryL.get(0), 1249, "��������", 7000, "����", 1));
		productL.add(new Product(categoryL.get(0), 1250, "�Ķ�����", 7000, "����", 1));
		productL.add(new Product(categoryL.get(1), 2435, "�����ǻ��", 13000, "����", 1));
	}
	
	public static Product getProduct(int pnum) {
		for(Product i: productL) {
			if(i.getProductNum() == pnum)
			return i;
		}
		return null;
	}
	
	public static Category getCategoryInStore(String CategoryName) {
		for(Category i: categoryL) {
			if(i.getName().equals(CategoryName)) {
				return i;
			}
		}		
		return null;
	}
	
	public static void requestProductCreation(Product newProduct) {
		productL.add(newProduct);
		
	}
}

