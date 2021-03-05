package com.ovschinecherem.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Integrity {
	private IntegrityId pk;
	private Boolean validphoto;
	private String facialphoto;
	
	@EmbeddedId
	public IntegrityId getPk() {
		return pk;
	}
	public void setPk(IntegrityId pk) {
		this.pk = pk;
	}
	public Boolean getValidphoto() {
		return validphoto;
	}
	public void setValidphoto(Boolean validphoto) {
		this.validphoto = validphoto;
	}
	public String getFacialphoto() {
		return facialphoto;
	}
	public void setFacialphoto(String facialphoto) {
		this.facialphoto = facialphoto;
	}
	
}
