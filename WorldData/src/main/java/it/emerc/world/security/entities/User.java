package it.emerc.world.security.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	@NotNull
	private String name;
	
	@Column(name = "userName", unique = true)
	@NotNull
	private String userName;
	
	@NotNull
	@Column (unique = true)
	private String email;
	
	@Column(name = "password")
	@NotNull
	private String password;
	
	@ManyToMany (fetch = FetchType.EAGER)//indexare l'user per alegerire la ricerca solo per l'user specifico
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "id_role"))
	private Set<Role> roles = new HashSet<>();

	public User() {
		super();
	}

	public User(@NotNull String name, @NotNull String userName, @NotNull String email,@NotNull String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	public User(@NotNull String name, @NotNull String userName) {
		super();
		this.name = name;
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	
}
