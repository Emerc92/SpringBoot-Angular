package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.wibs.eplastic.entities.OrderItemEntity;

public interface OrderItemRepo extends JpaRepository<OrderItemEntity, String>{
	Optional<OrderItemEntity> findById(String orderId);//non usato per adesso
	boolean existsById(String orderId);
}
