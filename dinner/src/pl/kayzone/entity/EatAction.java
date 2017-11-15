package pl.kayzone.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.Reference;

@Entity ("eating")
@Indexes ( @Index(value="customer", fields = @Field("customer")))
class EatAction {
	
	@Id
	private ObjectId id;
	@Reference 
	private Customer customer;
	private Date eatingdate;
	@Reference 
	private  MenuEntity menu;

	public EatAction() {
		
	}

	public Date getEatingdate() {
		return eatingdate;
	}

	public void setEatingdate(Date eatingdate) {
		this.eatingdate = eatingdate;
	}

}
