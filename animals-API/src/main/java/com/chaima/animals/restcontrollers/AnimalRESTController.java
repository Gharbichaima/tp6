package com.chaima.animals.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.chaima.animals.entities.Animal;
import com.chaima.animals.service.AnimalService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AnimalRESTController {
	@Autowired
	AnimalService animalService;
	
	@RequestMapping(path="all" ,method = RequestMethod.GET)
	public List<Animal> getAllProduits() {
	    return animalService.getAllAnimals();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Animal getProduitById(@PathVariable("id") Long id) {
	   return animalService.getAnimal(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Animal createProduit(@RequestBody Animal animal) {
	  return animalService.saveAnimal(animal);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Animal updateAnimal(@RequestBody Animal animal) {
	  return animalService.updateAnimal(animal);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAnimal(@PathVariable("id") Long id)
	{
		animalService.deleteAnimalById(id);
	}
	
	@RequestMapping(value="/animsrac/{idrac}",method = RequestMethod.GET)
	public List<Animal> getAnimalsByIdRace(@PathVariable("idrac") Long idrac) {
	return animalService.findByRaceIdRace(idrac);
	}
	

}
