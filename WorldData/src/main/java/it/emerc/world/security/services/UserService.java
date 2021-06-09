package it.emerc.world.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.emerc.world.security.entities.User;
import it.emerc.world.security.repositories.UserRepository;



@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public Optional<User> getByUserName(String userName){
		return userRepo.findByUserName(userName);
	}
	
	public boolean existsbyUserName(String userName) {
		return userRepo.existsByUserName(userName);
	}
	
	public void save(User user) {
		userRepo.save(user);
	}
	
}
