package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminteamDao;
import com.appfone.nna.pojo.NnaTeam;
import com.appfone.nna.service.AdminteamService;

@Service
public class AdminteamServiceimpl implements AdminteamService {

	@Autowired
	private AdminteamDao adminteam;
	
	@Override
	public List getAdminTeamlist() {
		List list = adminteam.getAdminTeamlist();
		return list;
	}

	@Override
	@Transactional
	public void deleteteam(int id) {
		adminteam.deleteteam(id);
	}

	@Override
	@Transactional
	public void saveTeam(NnaTeam team) {
		adminteam.saveTeam(team);
	}

	@Override
	@Transactional
	public NnaTeam getSingleteam(int id) {
		NnaTeam team = adminteam.getSingleteam(id);
		return team;
	}

}
