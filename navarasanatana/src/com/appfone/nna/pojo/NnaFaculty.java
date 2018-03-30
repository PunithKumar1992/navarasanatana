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
@Table(name="nnafaculty")
public class NnaFaculty {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="faculty_id")
	private int faculty_id;
	
	@Column(name="faculty_name")
	private String faculty_name;
	
	@Column(name="faculty_disc")
	private String faculty_disc;
	
	@Column(name="faculty_image")
	private String faculty_image;
	
	
	@Transient
	private MultipartFile facultyfile;


	public int getFaculty_id() {
		return faculty_id;
	}


	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}


	public String getFaculty_name() {
		return faculty_name;
	}


	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}


	public String getFaculty_disc() {
		return faculty_disc;
	}


	public void setFaculty_disc(String faculty_disc) {
		this.faculty_disc = faculty_disc;
	}


	public String getFaculty_image() {
		return faculty_image;
	}


	public void setFaculty_image(String faculty_image) {
		this.faculty_image = faculty_image;
	}


	public MultipartFile getFacultyfile() {
		return facultyfile;
	}


	public void setFacultyfile(MultipartFile facultyfile) {
		this.facultyfile = facultyfile;
	}


	@Override
	public String toString() {
		return "Faculty [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + ", faculty_disc=" + faculty_disc
				+ ", faculty_image=" + faculty_image + "]";
	}
	
	
	
	
	
}
