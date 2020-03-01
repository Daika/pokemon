package com.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dao.repository.PokemonRepository;
import com.model.Pokemon;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/pok")
public class PokemonControllerRest {
	   @Autowired
	    private PokemonRepository pokemonRepository;
	 
	    @GetMapping
	    public Iterable<Pokemon> findAll() {
	        return pokemonRepository.findAll();
	    }
	 
	    @GetMapping("/pokemon/{title}")
	    public List findByTitle(@PathVariable String title) {
	        return pokemonRepository.findByTitle(title);
	    }
	 
	    @GetMapping("/{id}")
	    public Optional<Pokemon> findOne(@PathVariable Long id) {
	        return pokemonRepository.findById(id);
	    }
	 
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Pokemon create(@RequestBody Pokemon pokemonDTO) {
	        return pokemonRepository.save(pokemonDTO);
	    }
	 
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	    	pokemonRepository.findById(id);
	        pokemonRepository.deleteById(id);
	    }
	 
	    @PutMapping("/{id}")
	    public Pokemon updateBook(@RequestBody Pokemon pokemonDTO, @PathVariable Long id) {
	       
	        return pokemonRepository.save(pokemonDTO);
	    }
}
