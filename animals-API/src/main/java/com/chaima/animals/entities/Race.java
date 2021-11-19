package com.chaima.animals.entities;

import java.util.List;

import javax.persistence.*;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Race {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRace;
	private String nomRace;
	private String descriptionRace;
	
	@OneToMany(mappedBy = "race")
	@JsonIgnore
	private List<Animal> animals;
	/*public String toString() {
		return "race [idrace =" + idRace + ", nomRace=" + nomRace + ", descriptionRace=" + descriptionRace
				+"]";
	}*/

	
	
}
