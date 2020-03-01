package com.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Pokemon;

import java.util.List;

public interface PokemonRepository  extends CrudRepository<Pokemon, Long>  {

	
	 List<Pokemon> findByTitle(String title);
}
