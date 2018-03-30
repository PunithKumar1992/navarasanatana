package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserFacultyDao;

@Service
public class UserFacultyService implements com.appfone.nna.service.UserFacultyService {

	@Autowired
	private UserFacultyDao userfaculty;
	@Override
	public List getFacultyList() {
		List list =userfaculty.getFacultyList();
		return list;
	}

}
