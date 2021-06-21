package it.wibs.eplastic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.wibs.eplastic.entities.CustomerEntity;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String>{
	Optional<CustomerEntity> findById(String customerCode);//non usato per adesso
	boolean existsById(String customerCode);
}
