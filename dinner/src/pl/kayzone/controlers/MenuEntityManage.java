package pl.kayzone.controlers;

import java.io.Serializable;

import pl.kayzone.entity.MenuEntity;
import pl.kayzone.utils.ObjectStorage;
import pl.kayzone.utils.ObjectStorageInterface;

public class MenuEntityManage implements Serializable, ObjectStorageInterface<MenuEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2795832780677651469L;
	private MenuEntity mu;
	
	public MenuEntityManage()  {
	
		this.mu = new MenuEntity() ;
		ObjectStorage<MenuEntity> menustor = new ObjectStorage<MenuEntity> ();
		menustor.save(mu);
	}

	@Override
	public void set(MenuEntity ob) {
		this.mu = ob;
		
	}

	@Override
	public MenuEntity get() {
		
		return this.mu;
	}

}
