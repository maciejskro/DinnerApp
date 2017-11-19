package pl.kayzone.controlers;

import pl.kayzone.entity.Customer;
import pl.kayzone.utils.ObjectStorage;
import pl.kayzone.utils.ObjectStorageInterface;

public class CustomerManage {

	public CustomerManage() {
		
		Customer cust = new Customer();
		ObjectStorageInterface<Customer> custStorage = new ObjectStorage<Customer>(cust);
		
		
	}

}
