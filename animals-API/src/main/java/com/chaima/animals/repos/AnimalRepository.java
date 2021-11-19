package com.chaima.animals.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chaima.animals.entities.Animal;
import com.chaima.animals.entities.Race;


@RepositoryRestResource(path = "rest")
public interface AnimalRepository extends JpaRepository<Animal, Long> {
	
	List<Animal> findByNomAnimal (String nom);
	List<Animal> findByNomAnimalContains(String nom); 
	
	@Query("select a from Animal a where a.nomAnimal like %?1 and a.couleur like ?2")
	List<Animal> findByNomcouleur (String nom, String couleur);
	@Query("select a from Animal a where a.race = ?1")
	List<Animal> findByRace (Race race);
	
	List<Animal> findByRaceIdRace(Long id);
	
	List<Animal> findByOrderByNomAnimalAsc();
	
	@Query("select a from Animal a order by a.nomAnimal ASC, a.couleur DESC")
	List<Animal> trierAnimalsNomscouleur ();


}
