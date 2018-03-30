package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminAdmissionDao;
import com.appfone.nna.pojo.NnaAdmission;
import com.appfone.nna.service.AdminAdmissionService;

@Service
public class AdminAdmissionServiceimpl implements AdminAdmissionService {

	@Autowired
	private AdminAdmissionDao adminadmission;
	@Override
	public List getAdmissionForm() {
		List list = adminadmission.getAdmissionForm();
		return list;
	}
	@Override
	@Transactional
	public NnaAdmission getAdmission(int id) {
		NnaAdmission admission = adminadmission.getAdmission(id);
		return admission;
	}
	@Override
	@Transactional
	public void saveAdmissionForm(NnaAdmission admission) {
		adminadmission.saveAdmissionForm(admission);
		
	}

}
