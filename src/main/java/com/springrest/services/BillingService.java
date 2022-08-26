package com.springrest.services;

import java.util.List;

import com.springrest.entities.Billing;

public interface BillingService {

	public void saveBill(Billing bill);
	
	public List<Billing> listAllBills();
	
}
