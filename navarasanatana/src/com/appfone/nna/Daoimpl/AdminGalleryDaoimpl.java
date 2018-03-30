package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminGalleryDao;
import com.appfone.nna.pojo.NnaGallery;

import javassist.tools.framedump;

@Repository
public class AdminGalleryDaoimpl implements AdminGalleryDao{

	
	@Autowired
	private SessionFactory factory;
	
	
	@Override
	public List getAdmingallery() {
	Session session = factory.openSession();
	Query query= session.createQuery("from NnaGallery");
	List list = query.list();
		return list;
	}


	@Override
	public void deleteadmingallery(int id) {
	Session session = factory.getCurrentSession();
	Query query=session.createQuery("delete from NnaGallery where gallery_id=:galleryid");
	query.setParameter("galleryid", id);
	int res= query.executeUpdate();
	System.out.println("result of deleting gallery is" +res);
	
		
	}


	@Override
	public void saveAdmingallery(NnaGallery gallery) {
	Session session= factory.getCurrentSession();
	session.saveOrUpdate(gallery);
		
	}
	
	

}
