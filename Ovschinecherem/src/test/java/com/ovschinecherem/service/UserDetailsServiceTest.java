package com.ovschinecherem.service;

import static org.hamcrest.CoreMatchers.not;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceTest {

	@Test
	void generate_encrypted_password() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password123";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		assertThat(rawPassword, not(encodedPassword));
	}

	private void assertThat(String rawPassword, Matcher<String> not) {
		// TODO Auto-generated method stub
		
	}


}
