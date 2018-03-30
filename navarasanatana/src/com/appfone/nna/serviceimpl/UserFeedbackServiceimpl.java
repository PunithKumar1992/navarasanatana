package com.appfone.nna.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserFeedbackDao;
import com.appfone.nna.pojo.NnaFeedback;
import com.appfone.nna.service.UserFeedbackService;


@Service
public class UserFeedbackServiceimpl implements UserFeedbackService {

	@Autowired
	private UserFeedbackDao userfeed;
	@Override
	@Transactional
	public void savefeedback(NnaFeedback feedback) {
		userfeed.savefeedback(feedback);

	}

}
