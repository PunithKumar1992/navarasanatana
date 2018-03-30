package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaAuditions;

public interface AdminauditionsService {

	public List getadminauditions();
	public void deleteAdminaudition(int id);
	public void saveAdminaudition(NnaAuditions audition);
}
