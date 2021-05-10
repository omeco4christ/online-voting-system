package com.ovschinecherem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
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
	
	@GetMapping("contact-messages")
	public String contactmessages() {
		return "contact-messages";
	}

}
