package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserAuditionDao;
import com.appfone.nna.service.UserAuditionService;

@Service
public class UserAuditionServiceimpl implements UserAuditionService {

	@Autowired
	private UserAuditionDao useraudition;
	@Override
	public List getauditionsList() {
		List list= useraudition.getauditionsList();
		return list;
	}

}
