package it.emerc.world.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.emerc.world.security.entities.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long>{

	Optional<User> findByUserName(String userName);
	boolean existsByUserName(String userName);
	boolean existsByEmail(String email);
}
