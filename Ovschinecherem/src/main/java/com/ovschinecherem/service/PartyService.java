package com.ovschinecherem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ovschinecherem.domain.Party;
import com.ovschinecherem.repositories.PartyRepository;

@Service
@Transactional
public class PartyService {
	
	@Autowired
	private PartyRepository partyRepo;
	
	public List<Party> listAll() {
		return partyRepo.findAll();
	}
	
	public void save(Party party) {
		partyRepo.save(party);
	}
	
	public Party get(long id) {
		return partyRepo.findById(id).get();
	}
	
	public void delete(long id) {
		partyRepo.deleteById(id);
	}

}
