package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaAdmission;

public interface AdminAdmissionService {

	public List getAdmissionForm();
	public NnaAdmission getAdmission(int id);
	public void saveAdmissionForm(NnaAdmission admission);
}
