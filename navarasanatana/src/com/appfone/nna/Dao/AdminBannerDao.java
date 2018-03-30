package com.appfone.nna.Dao;

import java.util.List;

import com.appfone.nna.pojo.NnaBanner;

public interface AdminBannerDao {
	
	public List getBannerlist();
	public void deletebanner(int id);
	public void saveBanner(NnaBanner bannerimg);
	public int getBannersize();
}
