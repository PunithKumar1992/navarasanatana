package com.appfone.nna.Daoimpl;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminBannerDao;
import com.appfone.nna.pojo.NnaBanner;
@Repository
public class AdminBannerDaoimpl implements AdminBannerDao {

	@Autowired
	private SessionFactory factory;
	
	
	@Override
	@SuppressWarnings("deprecation")
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


	@Override
	public void deletebanner(int id) {
	Session session=factory.getCurrentSession();
	Query query= session.createQuery("delete from NnaBanner where banner_id=:bannerid");
	query.setParameter("bannerid", id);
	int res=query.executeUpdate();
	System.out.println("the result of banner delete is "+res);
		
	}


	@Override
	public void saveBanner(NnaBanner bannerimg) {
	Session session = factory.getCurrentSession();
		session.save(bannerimg);
	
	}


	@Override
	@SuppressWarnings("deprecation")
	public int getBannersize() {
		
			int size=0;
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("select count(*) from NnaBanner");
		
			List list=query.list();
			Iterator itr=list.iterator();
			size=Integer.parseInt(itr.next().toString());
			return size;
	
	}

}
