package pl.kayzone.entity;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity
class MenuEntity {

	private ObjectId id;
	private Integer weekid;
	private String dayname;
	private List<String> itemmenu;
	
	public MenuEntity() {
		
		this.itemmenu = new ArrayList<String>();
		
	}

	ObjectId getId() {
		return id;
	}

	void setId(ObjectId id) {
		this.id = id;
	}

	Integer getWeekid() {
		return weekid;
	}

	void setWeekid(Integer weekid) {
		this.weekid = weekid;
	}

	String getDayname() {
		return dayname;
	}

	void setDayname(String dayname) {
		this.dayname = dayname;
	}

	List<String> getItemmenu() {
		return itemmenu;
	}

	void setItemmenu(List<String> itemmenu) {
		this.itemmenu = itemmenu;
	}

}
