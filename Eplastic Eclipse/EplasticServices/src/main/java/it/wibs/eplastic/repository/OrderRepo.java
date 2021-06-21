package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.wibs.eplastic.entities.OrderEntity;


@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, String>{
	Optional<OrderEntity> findById(String orderId);//non usato per adesso
	boolean existsById(String orderId);
}
