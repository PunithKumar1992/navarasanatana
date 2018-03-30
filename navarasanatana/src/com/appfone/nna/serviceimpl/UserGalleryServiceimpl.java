package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserGalleryDao;
import com.appfone.nna.service.UserGalleryService;

@Service
public class UserGalleryServiceimpl implements UserGalleryService {

	@Autowired
	private UserGalleryDao usergallery;
	@Override
	public List getgalleryList() {
	List list = usergallery.getgalleryList();
		return list;
	}

}
