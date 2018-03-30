package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaGallery;

public interface AdminGalleryDao {

	
	public List getAdmingallery();
	public void deleteadmingallery(int id);
	public void saveAdmingallery(NnaGallery gallery);
}
