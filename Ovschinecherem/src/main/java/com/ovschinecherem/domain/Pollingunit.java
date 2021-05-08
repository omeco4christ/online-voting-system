package com.ovschinecherem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pollingunit {
	private Long Id;
	private String pollingunitsname;
	private String pollingunitslocation;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPollingunitsname() {
		return pollingunitsname;
	}
	public void setPollingunitsname(String pollingunitsname) {
		this.pollingunitsname = pollingunitsname;
	}
	public String getPollingunitslocation() {
		return pollingunitslocation;
	}
	public void setPollingunitslocation(String pollingunitslocation) {
		this.pollingunitslocation = pollingunitslocation;
	}
	
	
}
