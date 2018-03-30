package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminFacultyDao;
import com.appfone.nna.pojo.NnaFaculty;
import com.appfone.nna.service.AdminFacultyService;

@Service
public class AdminFacultyServiceimpl implements AdminFacultyService {

	
	@Autowired
	private AdminFacultyDao facultyser;
	@Override
	@Transactional
	public List getFacultyList() {
		List list = facultyser.getFacultyList();
		return list;
	}
	@Override
	@Transactional
	public void saveFaculty(NnaFaculty faculty) {
		facultyser.saveFaculty(faculty);
		
		
	}
	@Override
	@Transactional
	public void deleteFaculty(int id) {
		facultyser.deleteFaculty(id);
	}
	@Override
	@Transactional
	public NnaFaculty getSingleFaculty(int id) {
		NnaFaculty faculty=facultyser.getSingleFaculty(id);
		
		return faculty;
	}

}
