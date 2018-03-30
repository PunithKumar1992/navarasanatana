package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaTeam;

public interface AdminteamService {

	
	public List getAdminTeamlist();
	public void deleteteam(int id);
	public void saveTeam(NnaTeam team);
	public NnaTeam getSingleteam(int id);



}
