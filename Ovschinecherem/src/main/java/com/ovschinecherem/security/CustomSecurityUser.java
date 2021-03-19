package com.ovschinecherem.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.ovschinecherem.domain.User;


public class CustomSecurityUser extends User implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3527646335034124875L;
	
	public CustomSecurityUser() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CustomSecurityUser(User user) {
		// TODO Auto-generated constructor stub
		
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setFirstname(user.getFirstname());
		this.setLastname(user.getLastname());
		this.setEmail(user.getEmail());
		this.setPassword(user.getPassword());
		this.setPhonenumber(this.getPhonenumber());
		this.setPhoto(user.getPhoto());
		this.setPpsnumber(user.getPpsnumber());
		this.setRoles(user.getRoles());
		this.setUsername(user.getUsername());
		this.setValidid(user.getValidid());
	}

	@Override
	public Set<Authority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.getAuthorities();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
