package com.appfone.nna.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.UserteamDao;

@Repository
public class UserteamDaoimpl implements UserteamDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public List getUserTeamlist() {
		Session session = factory.openSession();
		Query query = session.createQuery("from NnaTeam");
		List list = query.list();
		return list;
		
	}

}
