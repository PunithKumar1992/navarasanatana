package com.appfone.nna.Daoimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.UserbannerDao;

@Repository
public class UserbannerDaoimpl implements UserbannerDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public List getBannerlist() {
		System.out.println("in banner dao");
		Session session = factory.openSession();
		Query query = session.createQuery("from NnaBanner");
		
		List list = query.list();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return list;
		
	}

}
