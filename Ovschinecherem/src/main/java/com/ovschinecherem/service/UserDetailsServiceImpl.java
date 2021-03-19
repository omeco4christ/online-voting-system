package com.ovschinecherem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ovschinecherem.domain.User;
import com.ovschinecherem.repositories.UserRepository;
import com.ovschinecherem.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username);
		
		if (user == null)
			throw new UsernameNotFoundException("Invalid Username and Password");
		return new CustomSecurityUser(user);
	}

}
