package com.ovschinecherem.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class IntegrityId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8377528711800194681L;
	private User user;
	
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
