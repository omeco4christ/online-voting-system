package com.ovschinecherem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
	private Long id;
	private String candidatename;
	private String candidateage;
	private String candidatecounty;
	private String candidateparty;
	private String candidatephoto;
	private String candidatebio;
	private String candidatemanifesto;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getCandidateage() {
		return candidateage;
	}
	public void setCandidateage(String candidateage) {
		this.candidateage = candidateage;
	}
	public String getCandidatecounty() {
		return candidatecounty;
	}
	public void setCandidatecounty(String candidatecounty) {
		this.candidatecounty = candidatecounty;
	}
	public String getCandidateparty() {
		return candidateparty;
	}
	public void setCandidateparty(String candidateparty) {
		this.candidateparty = candidateparty;
	}
	public String getCandidatephoto() {
		return candidatephoto;
	}
	public void setCandidatephoto(String candidatephoto) {
		this.candidatephoto = candidatephoto;
	}
	public String getCandidatebio() {
		return candidatebio;
	}
	public void setCandidatebio(String candidatebio) {
		this.candidatebio = candidatebio;
	}
	public String getCandidatemanifesto() {
		return candidatemanifesto;
	}
	public void setCandidatemanifesto(String candidatemanifesto) {
		this.candidatemanifesto = candidatemanifesto;
	}
	
	
	
}
