package pl.kayzone.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity
class MenuEntity {

	public MenuEntity() {
		
		ObjectId id;
		Integer weekid;
		String dayname;
		List<String> itemmenu;
		
	}

}
