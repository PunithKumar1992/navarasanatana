package com.appfone.nna.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nnafeedback")
public class NnaFeedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feed_id")
	private int feed_id;
	
	@Column(name="feed_name")
	private String feed_name;
	
	@Column(name="feed_email")
	private String feed_email;
	
	@Column(name="feed_subject")
	private String feed_subject;
	
	@Column(name="feed_msg")
	private String feed_msg;
	
	
	public int getFeed_id() {
		return feed_id;
	}
	public void setFeed_id(int feed_id) {
		this.feed_id = feed_id;
	}
	public String getFeed_name() {
		return feed_name;
	}
	public void setFeed_name(String feed_name) {
		this.feed_name = feed_name;
	}
	public String getFeed_email() {
		return feed_email;
	}
	public void setFeed_email(String feed_email) {
		this.feed_email = feed_email;
	}
	public String getFeed_subject() {
		return feed_subject;
	}
	public void setFeed_subject(String feed_subject) {
		this.feed_subject = feed_subject;
	}
	public String getFeed_msg() {
		return feed_msg;
	}
	public void setFeed_msg(String feed_msg) {
		this.feed_msg = feed_msg;
	}
	@Override
	public String toString() {
		return "NnaFeedback [feed_id=" + feed_id + ", feed_name=" + feed_name + ", feed_email=" + feed_email
				+ ", feed_subject=" + feed_subject + ", feed_msg=" + feed_msg + "]";
	}
	
	
	
}
