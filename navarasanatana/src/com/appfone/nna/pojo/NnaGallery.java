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
@Table(name="nnagallery")
public class NnaGallery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gallery_id")
	private int gallery_id;
	
	@Column(name="gallery_image")
	private String gallery_image;
	
	
	@Transient
	private MultipartFile galleryfile;

	public int getGallery_id() {
		return gallery_id;
	}

	public void setGallery_id(int gallery_id) {
		this.gallery_id = gallery_id;
	}

	public String getGallery_image() {
		return gallery_image;
	}

	public void setGallery_image(String gallery_image) {
		this.gallery_image = gallery_image;
	}

	@Override
	public String toString() {
		return "NnaGallery [gallery_id=" + gallery_id + ", gallery_image=" + gallery_image + "]";
	}

	public MultipartFile getGalleryfile() {
		return galleryfile;
	}

	public void setGalleryfile(MultipartFile galleryfile) {
		this.galleryfile = galleryfile;
	}
	
	
	

}
