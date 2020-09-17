package main;
import user.Owner;
import management.ManagementController;
import store.Store;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner newOwner = new Owner();
		ManagementController newMController = Store.getManagementController();
		Store.StoreInit();
		
		//newOwner.requestProductManagement(newMController);
	}

}
