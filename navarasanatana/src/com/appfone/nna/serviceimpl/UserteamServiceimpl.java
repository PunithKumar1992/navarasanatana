package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserteamDao;
import com.appfone.nna.service.UserteamService;

@Service
public class UserteamServiceimpl implements UserteamService {

	@Autowired
	private UserteamDao userteam;
	@Override
	public List getUserTeamlist() {
		List list = userteam.getUserTeamlist();
		return list;
	}

}
