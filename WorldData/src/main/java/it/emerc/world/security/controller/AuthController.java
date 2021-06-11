package it.emerc.world.security.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.emerc.world.entities.MessageEntity;
import it.emerc.world.security.DTO.JwtDto;
import it.emerc.world.security.DTO.LoginUser;
import it.emerc.world.security.DTO.Newuser;
import it.emerc.world.security.JWT.JWTProvider;
import it.emerc.world.security.entities.Role;
import it.emerc.world.security.entities.User;
import it.emerc.world.security.enums.RolName;
import it.emerc.world.security.services.RolService;
import it.emerc.world.security.services.UserService;


@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	UserService userService;
	
	@Autowired
	RolService roleService;
	
	@Autowired
	JWTProvider jwtPovider;
	
	
	//@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/newuser")
	public ResponseEntity<?> newUser(@Valid @RequestBody Newuser newUser, @Valid BindingResult bindingResult){

		if(bindingResult.hasErrors()) {
			return new ResponseEntity(new MessageEntity("campi o mail errati"), HttpStatus.BAD_REQUEST);
		}
		if(userService.existsbyUserName(newUser.getUserName())) {
			return new ResponseEntity(new MessageEntity("l'username esiste già"), HttpStatus.BAD_REQUEST);
		}
		if(userService.existsbyEmail(newUser.getEmail())) {
			return new ResponseEntity(new MessageEntity("l'email inserita esiste già"), HttpStatus.BAD_REQUEST);
		}
		User user = new User(newUser.getName(), newUser.getUserName(), passwordEncoder.encode(newUser.getPassword()));
		Set<Role> roles = new HashSet<>();
		roles.add(roleService.getByRolName(RolName.ROLE_USER).get());
		if(newUser.getRoles().contains("admin")){
			roles.add(roleService.getByRolName(RolName.ROLE_ADMIN).get());
		}
		user.setRoles(roles);
		userService.save(user);
			return new ResponseEntity(new MessageEntity("user creato!!"), HttpStatus.CREATED);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody LoginUser loginUser, @Valid BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			return new ResponseEntity(new MessageEntity("username o password errate"), HttpStatus.BAD_REQUEST);
		}
		Authentication auth = authManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(auth);
		String jwt = jwtPovider.generateToken(auth);
		UserDetails userDetails = (UserDetails) auth.getPrincipal();
		JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
		
		return new ResponseEntity(jwtDto, HttpStatus.OK);
	}
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/deleteuser")
	public ResponseEntity<?> deleteUser(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult){
		return new ResponseEntity(new MessageEntity("user eliminato"), HttpStatus.OK);
	}
}
