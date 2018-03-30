package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminFeedbackDao;

@Repository
public class AdminFeedbackDaoimpl implements AdminFeedbackDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public List getAdminfeedbcak() {
		Session session = factory.openSession();
		Query query= session.createQuery("from NnaFeedback");
		List list=query.list();
		return list;
	}
	@Override
	public void deleteadminfeed(int id) {
		Session session = factory.getCurrentSession();
		Query query=session.createQuery("delete from NnaFeedback where feed_id=:feedid");
		query.setParameter("feedid", id);
		int res=query.executeUpdate();
		System.out.println("result of delete feed back is " +res);
		
	}

}
