package test;
import management.*;
import main.*;
import store.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ManagementTest {
	@Test
	public void testMain() {
		Main.main(null);
		
		assertTrue(Store.getManagementController() instanceof ManagementController);
	}
	
	@Test
	public void testRequestManagemet() {
		ManagementController managementController = new ManagementController();
		
		managementController.requestManagement();
		
		assertTrue(managementController.getManagement().getManagementType() == -1);
	}
	
	@Test
	public void testCreateNewProduct() {
		//Step 1: CREATE THE FIXTURE
		Management management = new Management();
		
		//Step 2: EXECUTE THE METHOD TO TEST
		management.createNewProduct();
		
	
		assertEquals(management.getProduct().getProductCategory(), null);
		assertTrue(management.getProduct().getProductNum() == 5123);
		assertTrue(management.getProduct().getProductName().equals("초기값"));
		assertTrue(management.getProduct().getProductPrice() == 0);
		assertTrue(management.getProduct().getProductInfo().equals("초기값"));
	}
	
	@Test
	public void testEnterProductInfo() {
		Management management = new Management();		
		Product product = new Product(Store.getCategoryInStore("Candle"), 1,"Orange Candle", 1000, "handmade", 1);		
		management.createNewProduct();
		
		management.enterProductInfo("Candle", "Orange Candle", 1, 1000, "handmade");
		
		assertEquals(management.getProduct().getProductCategory(),product.getProductCategory());
		assertTrue(management.getProduct().getProductNum() == product.getProductNum());
		assertTrue(management.getProduct().getProductName().equals(product.getProductName()));
		assertTrue(management.getProduct().getProductPrice() == product.getProductPrice());
		assertTrue(management.getProduct().getProductInfo().equals(product.getProductInfo()));
	}
	
	@Test
	public void testrequestCreation() {
		Management management = new Management();
		management.createNewProduct();
		management.enterProductInfo("Candle", "Orange Candle", 1, 1000, "handmade");
		
		management.requestCreation();
		
		assertEquals(management.getProduct(), Store.getProduct(1));
	}
}


