package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaGallery;

public interface AdminGalleryService {
	
	public List getAdmingallery();
	public void deleteadmingallery(int id);
	public void saveAdmingallery(NnaGallery gallery);

}
