package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserAdmissionDao;
import com.appfone.nna.service.UserAdmissionService;

@Service
public class UserAdmissionServiceimpl implements UserAdmissionService {

	@Autowired
	private UserAdmissionDao useradmission;
	
	@Override
	public List getAdmissionForm() {
		List list =useradmission.getAdmissionForm();
		return list;
	}

}
