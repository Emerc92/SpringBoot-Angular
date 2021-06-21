package it.emerc.world.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.emerc.world.security.entities.Role;
import it.emerc.world.security.enums.RolName;


@Repository
public interface RolRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByRoleName(RolName roleName);
}
