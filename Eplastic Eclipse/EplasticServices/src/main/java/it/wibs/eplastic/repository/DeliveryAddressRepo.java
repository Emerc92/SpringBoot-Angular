package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.wibs.eplastic.entities.DeliveryAddressEntity;

@Repository
public interface DeliveryAddressRepo extends JpaRepository<DeliveryAddressEntity, Long>{
	Optional<DeliveryAddressEntity> findById(long deliveryId);//non usato per adesso
	boolean existsById(long deliveryId);

}
