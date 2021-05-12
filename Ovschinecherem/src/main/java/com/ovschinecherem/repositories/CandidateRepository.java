package com.ovschinecherem.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ovschinecherem.domain.Candidate;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

	

}
