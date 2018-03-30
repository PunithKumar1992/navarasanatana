package com.appfone.nna.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.UserbannerDao;
import com.appfone.nna.service.UserbannerService;

@Service
public class UserbannerServiceimpl implements UserbannerService {

	@Autowired
	private UserbannerDao userbanner;
	@Override
	public List getBannerlist() {
		List list = userbanner.getBannerlist();
		return list;
	}

}
