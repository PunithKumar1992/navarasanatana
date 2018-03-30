package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminadsDao;
import com.appfone.nna.pojo.NnaAds;
import com.appfone.nna.service.AdminadsService;

@Service
public class AdminadsServiceimpl implements AdminadsService {

	@Autowired
	private  AdminadsDao adminads;
	@Override
	@Transactional
	public List getAdminads() {
		List list = adminads.getAdminads();
		return list;
	}
	@Override
	@Transactional
	public void deleteAdminads(int id) {
		adminads.deleteAdminads(id);
		
	}
	@Override
	@Transactional
	public void saveAdminads(NnaAds ads) {
		adminads.saveAdminads(ads);
		
	}

}
