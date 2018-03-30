package com.appfone.nna.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.RecoveryDao;
import com.appfone.nna.service.RecoveryService;

@Service
public class RecoveryServiceimpl implements RecoveryService {

	
	@Autowired
	private RecoveryDao recovery;
	@Override
	@Transactional
	public int checkMailidtosend(String email) {
		int res= recovery.checkMailidtosend(email);
		return res;
	}

	@Override
	@Transactional
	public String getusername(String email) {
		String user=recovery.getusername(email);
		return user;
	}

	@Override
	@Transactional
	public String getpassword(String email) {
		String pass=recovery.getpassword(email);
		return pass;
	}

}
