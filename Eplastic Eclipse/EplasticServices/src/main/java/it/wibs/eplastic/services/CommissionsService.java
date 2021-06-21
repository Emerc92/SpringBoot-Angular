package it.wibs.eplastic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.wibs.eplastic.entities.CommissionsEntity;
import it.wibs.eplastic.repository.CommissionsRepo;

@Service
@Transactional
public class CommissionsService {

	@Autowired
	CommissionsRepo commissionsRepo;
	
	public void save(CommissionsEntity commisison) {
		commissionsRepo.save(commisison);
	}
	
}
