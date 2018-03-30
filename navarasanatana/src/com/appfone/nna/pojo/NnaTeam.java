package com.appfone.nna.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="nnateam")
public class NnaTeam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="team_id")
	private int team_id;
	
	@Column(name="member_name")
	private  String member_name;
	
	@Column(name="member_disg")
	private  String member_disg;
	
	@Column(name="member_image")
	private String member_image;
	
	
	@Transient
	private MultipartFile teamfile;

	public MultipartFile getTeamfile() {
		return teamfile;
	}

	public void setTeamfile(MultipartFile teamfile) {
		this.teamfile = teamfile;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_disg() {
		return member_disg;
	}

	public void setMember_disg(String member_disg) {
		this.member_disg = member_disg;
	}

	public String getMember_image() {
		return member_image;
	}

	public void setMember_image(String member_image) {
		this.member_image = member_image;
	}

	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", member_name=" + member_name + ", member_disg=" + member_disg
				+ ", member_image=" + member_image + "]";
	}
	
	
	
	

}
