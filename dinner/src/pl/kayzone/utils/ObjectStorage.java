package pl.kayzone.utils;

import java.io.Serializable;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ObjectStorage<T> implements Serializable, ObjectStorageInterface<T> {


	private static final long serialVersionUID = 2535137648857930402L;
	final private Morphia morphia; 
	private Datastore ds;
	private MongoClient mongo;
	private T ob;
	public ObjectStorage() {
		morphia = new Morphia();
		// tu trzeba zrobić możliwość wyboru logowania do replicaset
		MongoClientURI muri = new MongoClientURI("mongodb://localhost:27017");
		mongo = new MongoClient(muri);
		
		//mailcollection = ds.getCollection();
	}

	public ObjectStorage(T ob) {
		this();
		setDs(morphia.createDatastore(mongo, ob.getClass().getName().toString()));
		this.save(ob);
	}
	
	public void save(T ob) {
		if(! ob.equals(null)) {
			ds.save(ob);
		}
	}
	@SuppressWarnings("unchecked")
	public T getObject(String id) {
		return (T) ds.createQuery(ob.getClass());
	}
	
	public void set(T ob)  {
		this.ob = ob;
	}
	public T get() {
		return ob;
	}

	public Datastore getDs() {
		return ds;
	}

	public void setDs(Datastore ds) {
		this.ds = ds;
	}
}
