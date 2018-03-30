package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaAdmission;

public interface AdminAdmissionDao {

	public List getAdmissionForm();
	public NnaAdmission getAdmission(int id);
	public void saveAdmissionForm(NnaAdmission admission);
}
