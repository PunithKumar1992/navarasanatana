package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaFaculty;

public interface AdminFacultyService {

	public List getFacultyList();
	public void saveFaculty(NnaFaculty faculty);
	
	public void deleteFaculty(int id);
	
	public NnaFaculty getSingleFaculty(int id);
}
