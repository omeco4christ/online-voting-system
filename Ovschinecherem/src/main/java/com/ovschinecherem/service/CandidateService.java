package com.ovschinecherem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ovschinecherem.domain.Candidate;
import com.ovschinecherem.repositories.CandidateRepository;

@Service
@Transactional
public class CandidateService {
	
	@Autowired
	private CandidateRepository candidateRepo;
	
	public List<Candidate> listAll() {
		return candidateRepo.findAll();
	}
	
	public void save(Candidate candidate) {
		candidateRepo.save(candidate);
	}
	
	public Candidate get(long id) {
		return candidateRepo.findById(id).get();
	}
	
	public void delete(long id) {
		candidateRepo.deleteById(id);
	}

}
