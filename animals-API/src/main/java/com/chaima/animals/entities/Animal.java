package com.chaima.animals.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // pour dire n est pas une simple classe c est une entities
public class Animal {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//pour l auto increment c facultative
	private Long idAnimal;
	private String nomAnimal;
	private String description;
	private String couleur;
	@ManyToOne
	private Race race;
		public Animal() {super();}
		public Animal(String nomAnimal, String description,String couleur) {
		super();
		this.nomAnimal = nomAnimal;
		this.description = description;
		this.couleur = couleur;
		}
	    public Long getIdAnimal() {return idAnimal;}
		public void setIdAnimal(Long idAnimal) {this.idAnimal = idAnimal;}
		public String getNomAnimal() {return nomAnimal;}
		public void setNomAnimal(String nomAnimal) {this.nomAnimal = nomAnimal;}
		public String getDescription() {return description;}
		public void setDescription(String description) {this.description = description;}
		public String getCouleur() {return couleur;}
		public void setCouleur(String couleur) {this.couleur = couleur;}
		@Override
		public String toString() {
			return "Animal [idAnimal=" + idAnimal + ", nomAnimal=" + nomAnimal + ", description=" + description
					+ ", couleur=" + couleur + "idcat"+race+"]";
		}
		
		
		
}
