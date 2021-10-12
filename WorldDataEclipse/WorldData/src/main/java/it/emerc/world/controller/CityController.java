package it.emerc.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.emerc.world.DTO.Message;
import it.emerc.world.entities.CityEntity;
import it.emerc.world.services.CityService;

@RestController
@RequestMapping("/city")
@CrossOrigin ()
public class CityController {

	@Autowired
	CityService cityService;
	
	@GetMapping("/list")
	public ResponseEntity<List<CityEntity>> list(){
		List<CityEntity> list =cityService.getListOfCities();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	@GetMapping("detail/{id}")
	public ResponseEntity<List<CityEntity>> getById(@PathVariable("id") long id){
		if(!cityService.existsById(id)) {
			return  new ResponseEntity(new Message("non esiste"), HttpStatus.BAD_REQUEST);
		}
		CityEntity city = cityService.getOne(id).get();
		return new ResponseEntity(city, HttpStatus.OK);
	}
	
	@GetMapping("detailname/{name}")
	public ResponseEntity<List<CityEntity>> getByName(@PathVariable("name") String name){
		if(!cityService.existsByName(name)) {
			return  new ResponseEntity(new Message("non esiste"), HttpStatus.BAD_REQUEST);
		}
		CityEntity city = cityService.getByName(name).get();
		return new ResponseEntity(city, HttpStatus.OK);
	}
	
}
