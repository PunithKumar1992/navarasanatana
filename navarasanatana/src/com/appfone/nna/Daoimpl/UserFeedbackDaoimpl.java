package com.appfone.nna.Daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.UserFeedbackDao;
import com.appfone.nna.pojo.NnaFeedback;

@Repository
public class UserFeedbackDaoimpl implements UserFeedbackDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public void savefeedback(NnaFeedback feedback) {
		
		Session session= factory.openSession();
		session.save(feedback);;
		
	}

}
