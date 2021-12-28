package it.emerc.world.security.entities;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class UserAdmin implements UserDetails {

	
	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;
	
	@NotNull
	private String userName;
	
	@NotNull
	private String password;
	
	@NotNull
	private String email;
	
	private Collection<? extends GrantedAuthority> authorities;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	

	public UserAdmin(String name, String userName, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserAdmin build(User user) {
		List<GrantedAuthority> auth = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().name())).collect(Collectors.toList());
	
		return new UserAdmin(user.getName(), user.getUserName(), user.getEmail(), user.getPassword(), auth);
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return userName;
	}

		
}
