package it.emerc.world.security.DTO;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;

public class Newuser {
	@NotBlank
	private String name;
	
	@NotBlank
	private String userName;

	@NotBlank
	private String password;
	
	private Set<String> roles = new HashSet<>();
	
	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
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
