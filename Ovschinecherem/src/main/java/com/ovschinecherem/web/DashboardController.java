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
}
