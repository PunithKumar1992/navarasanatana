package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaFaculty;

public interface AdminFacultyDao {
	
	public List getFacultyList();
	
	public void saveFaculty(NnaFaculty faculty);
	
	public void deleteFaculty(int id);
	
	public NnaFaculty getSingleFaculty(int id);

}
