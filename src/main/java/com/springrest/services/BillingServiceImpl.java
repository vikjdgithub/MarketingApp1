package com.springrest.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springrest.entities.Billing;
import com.springrest.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
	private BillingRepository billRepo;
	
	@Override
	public void saveBill(Billing bill) {

		billRepo.save(bill);
	}

	@Override
	public List<Billing> listAllBills() {
		List<Billing> bills = billRepo.findAll();
		return bills;
	}

	

}
