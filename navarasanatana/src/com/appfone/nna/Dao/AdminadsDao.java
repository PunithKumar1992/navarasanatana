package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaAds;

public interface AdminadsDao {
	
	public List getAdminads();
	public void deleteAdminads(int id);
	public void saveAdminads(NnaAds ads);

}
