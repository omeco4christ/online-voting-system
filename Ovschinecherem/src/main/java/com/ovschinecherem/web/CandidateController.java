package com.ovschinecherem.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ovschinecherem.domain.Candidate;
import com.ovschinecherem.service.CandidateService;

@Controller
public class CandidateController {
	
	@Autowired
	private CandidateService service;
	
	@RequestMapping("/political-candidates")
	public String viewCandidatePage(Model model) {
	    List<Candidate> listCandidates = service.listAll();
	    model.addAttribute("listCandidates", listCandidates);
	     
	    return "political-candidates";
	}
}
