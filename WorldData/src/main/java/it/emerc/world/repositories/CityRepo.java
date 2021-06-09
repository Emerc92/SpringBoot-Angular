package it.emerc.world.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.emerc.world.entities.CityEntity;

@Repository
public interface CityRepo extends JpaRepository<CityEntity, Long>{

	Optional<CityEntity>findByName(String name);
	boolean existsByName(String name);
	
}
