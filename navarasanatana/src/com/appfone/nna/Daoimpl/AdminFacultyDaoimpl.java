package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminFacultyDao;
import com.appfone.nna.pojo.NnaFaculty;

@Repository
public class AdminFacultyDaoimpl implements AdminFacultyDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	@SuppressWarnings("deprecation")
	public List getFacultyList() {
	Session session = factory.openSession();
	Query query= session.createQuery("from NnaFaculty");
	
	List list = query.list();
			return list;
	}

	@Override
	public void saveFaculty(NnaFaculty faculty) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(faculty);
		
	}

	@Override
	public void deleteFaculty(int id) {
	Session session =factory.getCurrentSession();
	Query query=session.createQuery("delete from NnaFaculty where faculty_id=:facultyid");
	query.setParameter("facultyid", id);
	int res= query.executeUpdate();
	System.out.println("result of deleting faculty is " +res);
	
		
	}

	@Override
	public NnaFaculty getSingleFaculty(int id) {
		Session session = factory.getCurrentSession();
		NnaFaculty faculty=session.get(NnaFaculty.class, id);
		return faculty;
	}

}
