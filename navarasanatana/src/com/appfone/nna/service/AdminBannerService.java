package com.appfone.nna.service;

import java.util.List;

import com.appfone.nna.pojo.NnaBanner;

public interface AdminBannerService {

	
	public List getBannerlist();
	public void deletebanner(int id);
	public void saveBanner(NnaBanner bannerimg);
	public int getBannersize();

}
