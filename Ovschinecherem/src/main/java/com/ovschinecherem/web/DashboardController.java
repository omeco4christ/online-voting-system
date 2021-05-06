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
}
