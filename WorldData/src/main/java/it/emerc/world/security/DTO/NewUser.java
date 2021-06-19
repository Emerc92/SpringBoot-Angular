package it.emerc.world.security.DTO;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;

public class NewUser {
	@NotBlank
	private String name;
	
	@NotBlank
	private String userName;

	@NotBlank
	private String password;
	
	@NotBlank
	private String email;
	
	private Set<String> roles = new HashSet<>();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public final Set<String> getRoles() {
		return roles;
	}

	public final void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
}
