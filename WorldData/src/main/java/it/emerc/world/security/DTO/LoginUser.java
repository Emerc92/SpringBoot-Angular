package it.emerc.world.security.DTO;

import javax.validation.constraints.NotBlank;

public class LoginUser {

	@NotBlank
	private String userName;

	@NotBlank
	private String password;
	
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
}
