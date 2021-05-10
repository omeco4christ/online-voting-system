package com.ovschinecherem.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ovschinecherem.domain.Party;
import com.ovschinecherem.service.PartyService;

@Controller
public class PartyController {
	
	@Autowired
	private PartyService partyService;
	
	//handler methods here
	
	
	@RequestMapping("/political-parties")
	public String viewPartyPage(Model model) {
		List<Party> listParties = partyService.listAll();
		model.addAttribute("listParties", listParties);
		return "political-parties";
	}
	
	/*@GetMapping("/party-registration")
	public String partyregistration() {
		return "party-registration";
	}*/
	
	@RequestMapping("/party-registration")
	public String showNewPartyPage(Model model) {
		Party party = new Party();
		model.addAttribute("party", party);
		
		return "party-registration";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveParty(@ModelAttribute("party") Party party) {
		partyService.save(party);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditPartyPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_party");
	    Party party = partyService.get(id);
	    mav.addObject("party", party);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteParty(@PathVariable(name = "id") int id) {
	    partyService.delete(id);
	    return "redirect:/";       
	}
}
