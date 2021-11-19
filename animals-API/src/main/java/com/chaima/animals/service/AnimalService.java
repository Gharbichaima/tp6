package com.chaima.animals.service;

import java.util.List;

import com.chaima.animals.entities.Animal;
import com.chaima.animals.entities.Race;

public interface AnimalService {
	Animal saveAnimal(Animal a);
	Animal updateAnimal(Animal a);
	void deleteAnimal(Animal a);
	 void deleteAnimalById(Long id);
	 Animal getAnimal(Long id);
	List<Animal> getAllAnimals();
	List<Animal> findByNomAnimal(String nom);
	List<Animal> findByNomAnimalContains(String nom);
	List<Animal> findByNomCouleur (String nom, String couleur);
	List<Animal> findByRace (Race race);
	List<Animal> findByRaceIdRace(Long id);
	List<Animal> findByOrderByNomAnimalAsc();
	List<Animal> trierProduitsNomsCouleur();

}
