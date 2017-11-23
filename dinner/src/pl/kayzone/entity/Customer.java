package pl.kayzone.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity 
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ObjectId id;
	private String customerName;
	private String customerSurname;
	private String customerPass;
	private String bankcount;
	
	public Customer() {
		this.id = new ObjectId();
	}
	
	public Customer(String name, String surname , String pass , String bankaccount ) {
		this();
		if (this.getId().equals(null) ) {
			this.setId(new ObjectId());
		}
		this.setCustomerName(name);
		this.setCustomerSurname(surname);
		this.setCustomerPass(pass);
		this.setBankcount(bankaccount);
	}

	ObjectId getId() {
		return id;
	}

	void setId(ObjectId id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public String getCustomerPass() {
		return customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public String getBankcount() {
		return bankcount;
	}

	public void setBankcount(String bankcount) {
		this.bankcount = bankcount;
	}

}
