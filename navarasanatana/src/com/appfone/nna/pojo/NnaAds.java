package com.appfone.nna.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="nnaads")
public class NnaAds {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ads_id")
	private int ads_id;
	@Column(name="ads_image")
	private String ads_image;
	
	@Transient
	private MultipartFile adsfile;
	
	
	public int getAds_id() {
		return ads_id;
	}
	public void setAds_id(int ads_id) {
		this.ads_id = ads_id;
	}
	public String getAds_image() {
		return ads_image;
	}
	public void setAds_image(String ads_image) {
		this.ads_image = ads_image;
	}
	@Override
	public String toString() {
		return "Ads [ads_id=" + ads_id + ", ads_image=" + ads_image + ", adsfile=" + adsfile + "]";
	}
	public MultipartFile getAdsfile() {
		return adsfile;
	}
	public void setAdsfile(MultipartFile adsfile) {
		this.adsfile = adsfile;
	}
	
	
	

}
