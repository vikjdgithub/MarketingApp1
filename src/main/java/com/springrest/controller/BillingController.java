package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.entities.Billing;
import com.springrest.entities.Contact;
import com.springrest.services.BillingService;
import com.springrest.services.ContactService;

@Controller
public class BillingController {
	
@Autowired
	private BillingService billService;

@Autowired
private ContactService contactService;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		billService.saveBill(bill);
		model.addAttribute("bill", bill);
		return "generate_bill";
	}
	
	@RequestMapping("/listallbills")
	public String listAllBills(ModelMap model) {
		List<Billing> bills = billService.listAllBills();
		model.addAttribute("bills", bills);
		return "search_billing_result";
	}
	
}
