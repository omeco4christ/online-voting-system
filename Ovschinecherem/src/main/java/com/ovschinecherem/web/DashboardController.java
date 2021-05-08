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
	
	@GetMapping("/party-registration")
	public String partyregistration() {
		return "party-registration";
	}
	
	@GetMapping("/candidate-registration")
	public String candidateregistration() {
		return "candidate-registration";
	}
	
	@GetMapping("/voter-registration")
	public String voterregistration() {
		return "voter-registration";
	}
	
	@GetMapping("/political-parties")
	public String politicalparties() {
		return "political-parties";
	}
	
	@GetMapping("/political-candidates")
	public String politicalcandidates() {
		return "political-candidates";
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
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/userspage")
	public String userspage() {
		return "userspage";
	}
	
	@GetMapping("/create-polling-units")
	public String createpollingunits() {
		return "create-polling-units";
	}
	
	@GetMapping("/registered-voters")
	public String registeredvoters() {
		return "registered-voters";
	}
	
	@GetMapping("/create-election-type")
	public String createelectiontype() {
		return "create-election-type";
	}
	
	@GetMapping("/contact-messages")
	public String contactmessages() {
		return "contact-messages";
	}
	
	@GetMapping("/webcam")
	public String webcam() {
		return "webcam";
	}
}
