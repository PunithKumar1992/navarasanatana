package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminauditionsDao;
import com.appfone.nna.pojo.NnaAuditions;
import com.appfone.nna.service.AdminauditionsService;
import com.sun.prism.impl.BaseMesh.FaceMembers;

@Service
public class AdminauditionsServiceimpl implements AdminauditionsService {

	@Autowired
	private AdminauditionsDao adminauditions;
	
	@Override
	@Transactional
	public List getadminauditions() {
		List list= adminauditions.getadminauditions();
		return list;
	}

	@Override
	@Transactional
	public void deleteAdminaudition(int id) {
		adminauditions.deleteAdminaudition(id);
		
	}

	@Override
	@Transactional
	public void saveAdminaudition(NnaAuditions audition) {
		adminauditions.saveAdminaudition(audition);
		
	}

}
