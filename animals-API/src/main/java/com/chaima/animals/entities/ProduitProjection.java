package com.chaima.animals.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomAnim", types = { Animal.class })
public interface ProduitProjection {
	public String getNomAnimal();
}
