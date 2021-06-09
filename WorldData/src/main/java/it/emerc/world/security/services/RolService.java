package it.emerc.world.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.emerc.world.security.entities.Role;
import it.emerc.world.security.enums.RolName;
import it.emerc.world.security.repositories.RolRepository;


@Service
@Transactional
public class RolService {

	@Autowired
	RolRepository roleRepo;
	
	public Optional<Role> getByRolName(RolName roleName){
		return roleRepo.findByRoleName(roleName);
	}
}
