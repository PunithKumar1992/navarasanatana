package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminFeedbackDao;
import com.appfone.nna.service.AdminFeedbackService;

@Service
public class AdminFeedbackServiceimpl implements AdminFeedbackService {

	@Autowired
	private AdminFeedbackDao adminfeedback;
	
	@Override
	@Transactional
	public List getAdminfeedbcak() {
		List list = adminfeedback.getAdminfeedbcak();
		return list;
	}

	@Override
	@Transactional
	public void deleteadminfeed(int id) {
		adminfeedback.deleteadminfeed(id);
	}

}
