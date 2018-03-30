package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminAddprofileDao;
import com.appfone.nna.pojo.NnaAdminregistration;
import com.appfone.nna.service.AdminAddprofileService;

@Service
public class AdminAddprofileServiceimpl implements AdminAddprofileService {

	@Autowired
	private AdminAddprofileDao adminprofile;
	@Override
	@Transactional
	public List getAdminprofile() {
		List list = adminprofile.getAdminprofile();
		return list;
	}

	@Override
	@Transactional
	public void deletesingleadmin(int id) {
		adminprofile.deletesingleadmin(id);

	}

	@Override
	@Transactional
	public NnaAdminregistration getsingleadmin(int id) {
		NnaAdminregistration admin = adminprofile.getsingleadmin(id);
		return admin;
	}

	@Override
	@Transactional
	public void saveadmin(NnaAdminregistration admin) {
		adminprofile.saveadmin(admin);

	}

	@Override
	@Transactional
	public List getAdminDetails(String user, String pass) {
		List list=adminprofile.getAdminDetails(user, pass);
		return list;
	}

}
