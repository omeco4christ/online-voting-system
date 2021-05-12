package com.ovschinecherem.web;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DashboardController {
	
	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 */

	/* @RequestMapping(value="/", method=RequestMethod.GET) */
	@GetMapping("/")
	public String rootView () {
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	
	
	@GetMapping("/candidate-registration")
	public String candidateregistration() {
		return "candidate-registration";
	}
	
	@GetMapping("/voter-registration")
	public String voterregistration() {
		return "voter-registration";
	}
	  
	
	@GetMapping("/polling-units")
	public String pollingunits() {
		return "polling-units";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/party-single")
	public String partysingle() {
		return "party-single";
	}
	
	@GetMapping("/candidate-single")
	public String candidatesingle() {
		return "candidate-single";
	}
	
	@GetMapping("/cast-vote")
	public String castvote() {
		return "cast-vote";
	}
	
	@GetMapping("/election-results")
	public String electionresults() {
		return "election-results";
	}
	
	@GetMapping("/election-board")
	public String electionboard() {
		return "election-board";
	}
	
	@GetMapping("/ballot-box")
	public String ballotbox() {
		return "ballot-box";
	}
	
	@GetMapping("/voters-certificate")
	public String voterscertificate() {
		return "voters-certificate";
	}
	
	
	
	@GetMapping("/webcam")
	public String webcam() {
		return "webcam";
	}
}
