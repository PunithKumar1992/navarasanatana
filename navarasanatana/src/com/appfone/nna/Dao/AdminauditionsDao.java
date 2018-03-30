package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaAuditions;

public interface AdminauditionsDao {

	public List getadminauditions();
	public void deleteAdminaudition(int id);
	public void saveAdminaudition(NnaAuditions audition);
	
}
