package it.emerc.world.security.DTO;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
	
	private String token;
	private String bearer = "Bearer";
	private String user;
	private Collection<? extends GrantedAuthority> authorities;
	
	public JwtDto(String token, String user, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.user = user;
		this.authorities = authorities;
	}

	public final String getToken() {
		return token;
	}

	public final void setToken(String token) {
		this.token = token;
	}

	public final String getBearer() {
		return bearer;
	}

	public final void setBearer(String bearer) {
		this.bearer = bearer;
	}

	public final String getUser() {
		return user;
	}

	public final void setUser(String user) {
		this.user = user;
	}

	public final Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public final void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
	
	
	
}
