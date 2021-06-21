package it.wibs.eplastic.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.wibs.eplastic.entities.CustomerEntity;
import it.wibs.eplastic.repository.CustomerRepo;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	public boolean existById(String code) {
		return customerRepo.existsById(code);
	}
	
	public void save(CustomerEntity customer) {
		customerRepo.save(customer);
	}
}
