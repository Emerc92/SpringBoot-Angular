package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.wibs.eplastic.entities.CommissionsEntity;

public interface CommissionsRepo extends JpaRepository<CommissionsEntity, Long>{

	Optional<CommissionsEntity> findById(long commissionId);
	boolean existsById(long commissionId);
}
