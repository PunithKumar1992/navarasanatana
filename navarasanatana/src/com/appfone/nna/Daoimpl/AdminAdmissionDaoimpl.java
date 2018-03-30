package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminAdmissionDao;
import com.appfone.nna.pojo.NnaAdmission;

import javassist.tools.framedump;

@Repository
public class AdminAdmissionDaoimpl implements AdminAdmissionDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List getAdmissionForm() {
		Session session=factory.openSession();
		Query query= session.createQuery("from NnaAdmission");
		List list=query.list();
		
		return list;
	}

	@Override
	public NnaAdmission getAdmission(int id) {
	
		Session session=factory.getCurrentSession();
		NnaAdmission admission= session.get(NnaAdmission.class, id);
		return admission;
	}

	@Override
	public void saveAdmissionForm(NnaAdmission admission) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(admission);
		
	}

}
