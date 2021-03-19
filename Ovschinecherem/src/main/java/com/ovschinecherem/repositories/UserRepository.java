package com.ovschinecherem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ovschinecherem.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
