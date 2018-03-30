package com.appfone.nna.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminloginDao;
import com.appfone.nna.service.AdminloginService;

@Service
public class AdminloginServiceimpl implements AdminloginService {
	
	@Autowired
	private AdminloginDao adminchk;

	@Override
	@Transactional
	public int checkAdmin(String name, String pass) {
	
		int res = adminchk.checkAdmin(name, pass);
		return res;
	}

}
