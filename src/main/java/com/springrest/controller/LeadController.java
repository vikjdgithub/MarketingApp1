package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.entities.Contact;
import com.springrest.entities.Lead;
import com.springrest.services.ContactService;
import com.springrest.services.LeadService;


@Controller
public class LeadController {
@Autowired
	private LeadService leadService;

	@Autowired
private ContactService contactService;

	@RequestMapping("/")
	public String createLeadPage() {
		
		
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String saveOneLead( @ModelAttribute ("lead") Lead lead, ModelMap model) {
		leadService.saveOneLead(lead);
		
		model.addAttribute("msg", "record is saved");
		
		return "create_lead";
		
	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		
		List<Lead> leads = leadService.listLead();
		model.addAttribute("leads", leads);
	      return "search_lead";	
		
	}
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertlead")
	
	public String getOneLeadData(@RequestParam("id") long id ,ModelMap model) {
		
		Lead lead = leadService.getOneLeadById(id);
		
		Contact contact = new Contact();
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactService.saveOneContact(contact);
		
		leadService.deleteOneLeadById(id);
		
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts", contacts);
		return "search_contact";
	}
	@RequestMapping("/contactinfo")
	public String contactInfo(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getOneContact(id);
		
		model.addAttribute("contact", contact);
		
		return "contact_info";
	}
	
	
	
	
}
