package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaAdminregistration;

public interface AdminAddprofileService {
	
	public List getAdminprofile();
	public void deletesingleadmin(int id);
	public NnaAdminregistration getsingleadmin(int id);
	public void saveadmin(NnaAdminregistration admin);
	
	public List getAdminDetails(String user,String pass);

}
