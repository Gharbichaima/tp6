package com.chaima.animals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chaima.animals.entities.Animal;
import com.chaima.animals.entities.Race;
import com.chaima.animals.repos.AnimalRepository;

@SpringBootTest
class AnimalsApplicationTests {

	@Autowired
	private AnimalRepository animalRepository;
	@Test
	public void testCreateAnimal() {
		Animal prod = new Animal( "bobie_Chien","inteligent","noir");
		animalRepository.save(prod);
	}
	@Test
	public void testFindAnimal()
	{
	Animal a = animalRepository.findById(1L).get(); 
	System.out.println(a);
	}
	@Test
	public void testUpdateAnimal()
	{
		Animal a = animalRepository.findById(1L).get();
		a.setCouleur("maron");
		animalRepository.save(a);
	}
	@Test
	public void testDeleteAnimal()
	{
		animalRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousAnimals()
	{
	List<Animal> anim = animalRepository.findAll();
	for (Animal a : anim)
	{
	System.out.println(a);
	}
	}

	@Test
	public void testFindAnimalByNom()
	{
	List<Animal> anim = animalRepository.findByNomAnimal("chien");
	for (Animal a : anim)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testFindAnimalByNomContains()
	{
	List<Animal> anim = animalRepository.findByNomAnimalContains("chien");
	for (Animal a : anim)
	{
	System.out.println(a);
	}
	}
	@Test
	public void testFindAnimalByNomCouleur()
	{
	List<Animal> anim = animalRepository.findByNomcouleur("chien", "noir");
		for (Animal a : anim)
		{
		   System.out.println(a);
		}
	}
	@Test
	public void testfindByRace()
	{
		Race ra = new Race();
		ra.setIdRace(1L);
		List<Animal> anim = animalRepository.findByRace(ra);
			for (Animal a : anim)
			{
			   System.out.println(a);
			}
	}
	
	@Test
	public void findByRaceIdRace()
		{
		List<Animal> anim =animalRepository.findByRaceIdRace(1L);
		for (Animal a : anim)
		{
		System.out.println(a);
		}
		 }
	
	@Test
	public void testfindByOrderByNomAnimalAsc()
	{
	List<Animal> anim =animalRepository.findByOrderByNomAnimalAsc();
	for (Animal a: anim)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Animal> anim = animalRepository.trierAnimalsNomscouleur();
	for (Animal a : anim)
	{
	System.out.println(a);
	}
	}
}
