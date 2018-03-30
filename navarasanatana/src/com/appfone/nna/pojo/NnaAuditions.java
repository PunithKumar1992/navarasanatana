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
@Table(name="nnaauditions")
public class NnaAuditions {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="auditions_id")
	private int auditions_id;
	
	@Column(name="auditions_image")
	private String auditions_image;
	
	
	@Transient
	private MultipartFile auditionsfile;

	public int getAuditions_id() {
		return auditions_id;
	}

	public void setAuditions_id(int auditions_id) {
		this.auditions_id = auditions_id;
	}

	public String getAuditions_image() {
		return auditions_image;
	}

	public void setAuditions_image(String auditions_image) {
		this.auditions_image = auditions_image;
	}

	@Override
	public String toString() {
		return "NnaAuditions [auditions_id=" + auditions_id + ", auditions_image=" + auditions_image + "]";
	}

	public MultipartFile getAuditionsfile() {
		return auditionsfile;
	}

	public void setAuditionsfile(MultipartFile auditionsfile) {
		this.auditionsfile = auditionsfile;
	}

}
