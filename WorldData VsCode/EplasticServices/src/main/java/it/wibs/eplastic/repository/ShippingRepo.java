package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.wibs.eplastic.entities.ShippingEntity;

@Repository
public interface ShippingRepo extends JpaRepository<ShippingEntity, Long> {

	Optional<ShippingEntity> findById(long shippingId);
		boolean existsById(long shippingId);
	
}
