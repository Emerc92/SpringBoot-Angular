package it.wibs.eplastic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.wibs.eplastic.entities.OrderItemEntity;
import it.wibs.eplastic.repository.OrderItemRepo;

@Service
@Transactional
public class OrderItemService {

	@Autowired
	OrderItemRepo orderItemRepo;
	public void save(OrderItemEntity orderItem) {
		orderItemRepo.save(orderItem);
	}
}
