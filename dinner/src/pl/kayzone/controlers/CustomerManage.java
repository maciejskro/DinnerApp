package pl.kayzone.controlers;

import pl.kayzone.entity.Customer;
import pl.kayzone.utils.ObjectStorage;
import pl.kayzone.utils.ObjectStorageInterface;

public class CustomerManage {

	private ObjectStorageInterface objstor;
	public CustomerManage() {
		
		String name = "Name ";
		String surname = " drugie" ;
		String pass = "stest";
		String bank = "3345453340-23343";
 		Customer cust = new Customer( name, surname, pass, bank);
	
		ObjectStorageInterface<Customer> custStorage = new ObjectStorage<Customer>(cust);
		 
		
		
		
	}

}
