package com.appfone.nna.Daoimpl;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminAddprofileDao;
import com.appfone.nna.pojo.NnaAdminregistration;


@Repository
public class AdminAddprofileDaoimpl implements AdminAddprofileDao{

	@Autowired
	private SessionFactory factory;
	@Override
	public List getAdminprofile() {
		System.out.println("in profile dao");
		Session session= factory.openSession();
		Query query= session.createQuery("from NnaAdminregistration");
		List list=query.list();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		return list;
	}

	@Override
	public void deletesingleadmin(int id) {
		Session session = factory.getCurrentSession();
		Query query= session.createQuery("delete from NnaAdminregistration where admin_id=:adminid");
		query.setParameter("adminid", id);
		int res= query.executeUpdate();
		System.out.println("the result of deleting admin is " +res);
		
	}

	@Override
	public NnaAdminregistration getsingleadmin(int id) {
		Session session = factory.getCurrentSession();
		NnaAdminregistration admin = session.get(NnaAdminregistration.class, id);
		return admin;
	}

	@Override
	public void saveadmin(NnaAdminregistration admin) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(admin);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List getAdminDetails(String user, String pass) {
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("from NnaAdminregistration where admin_name=:name and admin_password=:pwd");
		query.setParameter("name", user);
		query.setParameter("pwd", pass);
		
		List list = query.getResultList();
		return list;
	}

}
