package com.chaima.animals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.animals.entities.Animal;
import com.chaima.animals.entities.Race;
import com.chaima.animals.repos.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
		
	@Autowired
	AnimalRepository animalRepository;
	@Override
	public Animal saveAnimal(Animal a) {
	return animalRepository.save(a);
	}
	@Override
	public Animal updateAnimal(Animal a) {
	return animalRepository.save(a);
	}
	@Override
	public void deleteAnimal(Animal a) {
		animalRepository.delete(a);
	}
	 @Override
	public void deleteAnimalById(Long id) {
		 animalRepository.deleteById(id);
	}
	@Override
	public Animal getAnimal(Long id) {
	return animalRepository.findById(id).get();
	}
	@Override
	public List<Animal> getAllAnimals() {
	return animalRepository.findAll();
	}
	@Override
	public List<Animal> findByNomAnimal(String nom) {
		return animalRepository.findByNomAnimal(nom);
	}
	@Override
	public List<Animal> findByNomAnimalContains(String nom) {
		return animalRepository.findByNomAnimalContains(nom);
	}
	@Override
	public List<Animal> findByNomCouleur(String nom, String couleur) {
		return animalRepository.findByNomcouleur(nom, couleur);
	}
	@Override
	public List<Animal> findByRace(Race race) {
		return animalRepository.findByRace(race);
	}
	@Override
	public List<Animal> findByRaceIdRace(Long id) {
		return animalRepository.findByRaceIdRace(id);
	}
	@Override
	public List<Animal> findByOrderByNomAnimalAsc() {
		return animalRepository.findByOrderByNomAnimalAsc();
	}
	@Override
	public List<Animal> trierProduitsNomsCouleur() {
		return animalRepository.trierAnimalsNomscouleur();
	}
	
}
