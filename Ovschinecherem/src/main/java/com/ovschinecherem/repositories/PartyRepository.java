package com.ovschinecherem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ovschinecherem.domain.Party;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

	


	
	
}
