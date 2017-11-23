package pl.kayzone.controlers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import pl.kayzone.entity.Customer;
import pl.kayzone.utils.ObjectStorage;
import pl.kayzone.utils.ObjectStorageInterface;

@ManagedBean(name="customermanage")
@SessionScoped
public class CustomerManage implements Serializable, ObjectStorageInterface<Customer>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1449842363598657599L;
	private Customer cust ;
	
	public CustomerManage() {
		
		String name = "Name ";
		String surname = " drugie" ;
		String pass = "stest";
		String bank = "3345453340-23343";
 		this.cust = new Customer( name, surname, pass, bank);
  		ObjectStorage<Customer> custStor = new ObjectStorage<Customer>(cust);
	
		//ObjectStorageInterface<Customer> custStorage ;
		custStor.save(cust);
		
	}

	@Override
	public void set(Customer ob) {
		this.cust = ob;
		
	}

	@Override
	public Customer get() {
		
		return this.cust;
	}
	
	public String getCustomerName() {
		return this.cust.getCustomerSurname() + " " + this.cust.getCustomerName();
	}


}
