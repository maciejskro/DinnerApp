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
		
	}
	
	public Customer(String name, String surname , String pass , String bankaccount ) {
		if (this.getId().equals(null) || this.getId().equals("")) {
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

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	String getCustomerSurname() {
		return customerSurname;
	}

	void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	String getCustomerPass() {
		return customerPass;
	}

	void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public String getBankcount() {
		return bankcount;
	}

	public void setBankcount(String bankcount) {
		this.bankcount = bankcount;
	}

}
