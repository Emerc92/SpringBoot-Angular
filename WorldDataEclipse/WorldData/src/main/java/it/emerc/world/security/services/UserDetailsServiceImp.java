package it.emerc.world.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import it.emerc.world.security.entities.User;
import it.emerc.world.security.entities.UserAdmin;


@Service
public class UserDetailsServiceImp implements UserDetailsService {

	
	@Autowired
	UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userService.getByUserName(userName).get();
		return UserAdmin.build(user);
	}



}
