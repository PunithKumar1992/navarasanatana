package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminauditionsDao;
import com.appfone.nna.pojo.NnaAuditions;

@Repository
public class AdminauditionsDaoimpl implements AdminauditionsDao {

	
	
	@Autowired
	private SessionFactory factory;
	
	@Override
	public List getadminauditions() {
		Session session= factory.openSession();
		Query query= session.createQuery("from NnaAuditions");
		
		List list = query.list();
		return list;
	}

	@Override
	public void deleteAdminaudition(int id) {
	Session session = factory.getCurrentSession();
	Query query= session.createQuery("delete from NnaAuditions where auditions_id=:audid");
	query.setParameter("audid", id);
	int res=query.executeUpdate();
	System.out.println("the result of delete audition is " +res);
		
	}

	@Override
	public void saveAdminaudition(NnaAuditions audition) {
		Session session =factory.getCurrentSession();
		session.save(audition);
		
	}

}
