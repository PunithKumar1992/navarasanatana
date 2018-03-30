package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminadsDao;
import com.appfone.nna.pojo.NnaAds;

@Repository
public class AdminadsDaoimpl implements AdminadsDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public List getAdminads() {
		
		Session session = factory.openSession();
		Query query= session.createQuery("from NnaAds");
		List list = query.list();
		
		return list;
	}

	@Override
	public void deleteAdminads(int id) {
		Session session=factory.getCurrentSession();
		Query query= session.createQuery("delete from NnaAds where ads_id=:adid");
		query.setParameter("adid", id);
		int res=query.executeUpdate();
		
	}

	@Override
	public void saveAdminads(NnaAds ads) {
				Session session = factory.getCurrentSession();
				session.save(ads);
	}

}
