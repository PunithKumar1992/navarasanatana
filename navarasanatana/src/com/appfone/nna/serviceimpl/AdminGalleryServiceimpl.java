package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminGalleryDao;
import com.appfone.nna.pojo.NnaGallery;
import com.appfone.nna.service.AdminGalleryService;

@Service
public class AdminGalleryServiceimpl implements AdminGalleryService {

	@Autowired
	private AdminGalleryDao admingallery;
	
	@Override
	@Transactional
	public List getAdmingallery() {
		List list = admingallery.getAdmingallery();
		
		return list;
	}

	@Override
	@Transactional
	public void deleteadmingallery(int id) {
		
		admingallery.deleteadmingallery(id);
	}

	@Override
	@Transactional
	public void saveAdmingallery(NnaGallery gallery) {
		
		admingallery.saveAdmingallery(gallery);
	}

}
