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
@Table(name="nnabanner")
public class NnaBanner {
	
	
	@Id
	@Column(name="banner_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int banner_id;
	
	
	@Column(name="banner_name")
	private String banner_name;
	
	@Transient
	private MultipartFile adminbannerfile;


	public int getBanner_id() {
		return banner_id;
	}


	public void setBanner_id(int banner_id) {
		this.banner_id = banner_id;
	}


	public String getBanner_name() {
		return banner_name;
	}


	public void setBanner_name(String banner_name) {
		this.banner_name = banner_name;
	}


	@Override
	public String toString() {
		return "Banner [banner_id=" + banner_id + ", banner_name=" + banner_name + "]";
	}


	public MultipartFile getAdminbannerfile() {
		return adminbannerfile;
	}


	public void setAdminbannerfile(MultipartFile adminbannerfile) {
		this.adminbannerfile = adminbannerfile;
	}

	
	
}
