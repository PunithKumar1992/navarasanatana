package com.appfone.nna.Dao;

public interface RecoveryDao {
	public int checkMailidtosend(String email);
	public String getusername(String email);
	public String getpassword(String email);

}
