package com.appfone.nna.Daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminloginDao;

@Repository
public class AdminloginDaoimpl implements AdminloginDao {
	
	@Autowired
	SessionFactory factory;

	@SuppressWarnings("deprecation")
	@Override
	public int checkAdmin(String name, String pass) {
		Session session=factory.openSession();
		Query qry=session.createQuery("from NnaAdminregistration where admin_name=:name and admin_password=:pass");
		qry.setParameter("name", name);
		qry.setParameter("pass", pass);
		List list=qry.list();
		int flag=0;
		if ((list != null) && (list.size() > 0)) {
			flag=1;
		}
		

		
			return flag;
		
	}
	

}
