package it.emerc.world.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.emerc.world.entities.CityEntity;
import it.emerc.world.repositories.CityRepo;

@Service
@Transactional
public class CityService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CityService.class);
	
	@Autowired
	CityRepo cityRepo;
	
	public boolean existsById(long id){
		LOGGER.info("exists by id is = " + cityRepo.existsById(id));
		return cityRepo.existsById(id);	
		}
	
	public boolean existsByName(String name){
		LOGGER.info("exists by id is = " + cityRepo.existsByName(name));
		return cityRepo.existsByName(name);	
		}
	
	public List<CityEntity> getListOfCities(){
		LOGGER.info("starting cityService listOfCities");
		return cityRepo.findAll();
	}
	
	public Optional<CityEntity> getOne(long id){
		LOGGER.info("Getting Optional service getOne...");
		return cityRepo.findById(id);
	}
	
	public Optional<CityEntity> getByName(String name){
		LOGGER.info("Getting Optional service getByName...");
		return cityRepo.findByName(name);
	}
	
	
	
}
