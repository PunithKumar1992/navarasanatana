package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaAds;

public interface AdminadsService {
	public List getAdminads();
	public void deleteAdminads(int id);
	public void saveAdminads(NnaAds ads);


}
