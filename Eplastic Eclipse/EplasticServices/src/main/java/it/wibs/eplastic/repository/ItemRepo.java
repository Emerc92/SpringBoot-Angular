package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.wibs.eplastic.entities.ItemEntity;

public interface ItemRepo extends JpaRepository<ItemEntity, String>{

	Optional<ItemEntity> findById(String itemId);
	boolean existsById(String itemId);
}
