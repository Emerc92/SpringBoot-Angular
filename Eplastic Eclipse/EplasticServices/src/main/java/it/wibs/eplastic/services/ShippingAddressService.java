package it.wibs.eplastic.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.wibs.eplastic.entities.ShippingEntity;
import it.wibs.eplastic.repository.ShippingRepo;

@Service
@Transactional
public class ShippingAddressService {

	@Autowired
	ShippingRepo shippingRepo;
	
	public void save(ShippingEntity shipEntity) {
		shippingRepo.save(shipEntity);
	}
	
}
