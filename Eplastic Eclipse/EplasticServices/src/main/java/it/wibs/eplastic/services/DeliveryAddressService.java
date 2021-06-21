package it.wibs.eplastic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.wibs.eplastic.entities.DeliveryAddressEntity;
import it.wibs.eplastic.repository.DeliveryAddressRepo;

@Service
@Transactional
public class DeliveryAddressService {
	@Autowired
	DeliveryAddressRepo deliveryAddressRepo;
	
	public void save(DeliveryAddressEntity defShipEnt) {
		deliveryAddressRepo.save(defShipEnt);
	}
}