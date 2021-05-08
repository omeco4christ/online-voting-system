package com.ovschinecherem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voter {
	private Long id;
	private String votername;
	private String voteremail;
	private String voterphonenumber;
	private String voterppsnumber;
	private String voterparty;
	private String voterphoto;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVotername() {
		return votername;
	}
	public void setVotername(String votername) {
		this.votername = votername;
	}
	public String getVoteremail() {
		return voteremail;
	}
	public void setVoteremail(String voteremail) {
		this.voteremail = voteremail;
	}
	public String getVoterphonenumber() {
		return voterphonenumber;
	}
	public void setVoterphonenumber(String voterphonenumber) {
		this.voterphonenumber = voterphonenumber;
	}
	public String getVoterppsnumber() {
		return voterppsnumber;
	}
	public void setVoterppsnumber(String voterppsnumber) {
		this.voterppsnumber = voterppsnumber;
	}
	public String getVoterparty() {
		return voterparty;
	}
	public void setVoterparty(String voterparty) {
		this.voterparty = voterparty;
	}
	public String getVoterphoto() {
		return voterphoto;
	}
	public void setVoterphoto(String voterphoto) {
		this.voterphoto = voterphoto;
	}
	
	
	

}
