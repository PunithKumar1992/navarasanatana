package com.appfone.nna.Daoimpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appfone.nna.Dao.AdminteamDao;
import com.appfone.nna.pojo.NnaTeam;

@Repository
public class AdminteamDaoimpl implements AdminteamDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public List getAdminTeamlist() {
		Session session = factory.openSession();
		Query query = session.createQuery("from NnaTeam");
		List list = query.list();
		return list;
	}
	@Override
	public void deleteteam(int id) {
		Session session = factory.getCurrentSession();
		Query query= session.createQuery("delete from NnaTeam where team_id=:teamid");
		query.setParameter("teamid", id);
		int res= query.executeUpdate();
		System.out.println("result of deleting team is" +res);
		
	}
	@Override
	
	public void saveTeam(NnaTeam team) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(team);
		
	}
	@Override
	public NnaTeam getSingleteam(int id) {
		Session session = factory.getCurrentSession();
		NnaTeam team = (NnaTeam)session.get(NnaTeam.class, id);
		return team;
		
	}

}
