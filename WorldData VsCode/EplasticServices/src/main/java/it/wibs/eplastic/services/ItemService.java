package it.wibs.eplastic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.wibs.eplastic.entities.ItemEntity;
import it.wibs.eplastic.repository.ItemRepo;

@Service
@Transactional
public class ItemService {

	@Autowired
	ItemRepo itemRepo;
	public void save(ItemEntity item) {
		itemRepo.save(item);
	}
}
