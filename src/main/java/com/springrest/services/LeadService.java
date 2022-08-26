package com.springrest.services;

import java.util.List;

import com.springrest.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);
	
	public List<Lead> listLead();
	
	public Lead getOneLeadById(long id);
	
	public void deleteOneLeadById(long id);
	
}
