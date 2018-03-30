package com.appfone.nna.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appfone.nna.Dao.AdminBannerDao;
import com.appfone.nna.Daoimpl.AdminBannerDaoimpl;
import com.appfone.nna.pojo.NnaBanner;
import com.appfone.nna.service.AdminBannerService;

@Service
public class AdminBannerServiceimpl  implements AdminBannerService{

	@Autowired
	private AdminBannerDao banner;
	
	@Override
	@Transactional
	public List getBannerlist() {
		List list = banner.getBannerlist();
		System.out.println("in banner service");
		return list;
	}

	@Override
	@Transactional
	public void deletebanner(int id) {
		banner.deletebanner(id);
		
	}

	@Override
	@Transactional
	public void saveBanner(NnaBanner bannerimg) {
		banner.saveBanner(bannerimg);
		
	}

	@Override
	@Transactional
	public int getBannersize() {
		int size = banner.getBannersize();
		return size;
	}

}
