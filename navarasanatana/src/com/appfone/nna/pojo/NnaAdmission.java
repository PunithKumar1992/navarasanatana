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
@Table(name="nnaadmission")
public class NnaAdmission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admission_id")
	private int admission_id;
	
	@Column(name="admission_image")
	private String admission_image;
	
	
	@Transient
	private MultipartFile admissionfile;

	public int getAdmission_id() {
		return admission_id;
	}

	public void setAdmission_id(int admission_id) {
		this.admission_id = admission_id;
	}

	public String getAdmission_image() {
		return admission_image;
	}

	public void setAdmission_image(String admission_image) {
		this.admission_image = admission_image;
	}

	@Override
	public String toString() {
		return "NnaAdmission [admission_id=" + admission_id + ", admission_image=" + admission_image + "]";
	}

	public MultipartFile getAdmissionfile() {
		return admissionfile;
	}

	public void setAdmissionfile(MultipartFile admissionfile) {
		this.admissionfile = admissionfile;
	}
	
	
	
	

}
