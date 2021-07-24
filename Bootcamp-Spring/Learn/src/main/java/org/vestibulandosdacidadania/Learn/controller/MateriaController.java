package org.vestibulandosdacidadania.Learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vestibulandosdacidadania.Learn.model.Aula;
import org.vestibulandosdacidadania.Learn.model.Materia;
import org.vestibulandosdacidadania.Learn.repository.MateriaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Materia")
public class MateriaController {
	
	@Autowired
	private MateriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Materia>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Materia> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<Materia>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Materia> post(@RequestBody Materia materia){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(materia));
	}
	
	@PutMapping
	public ResponseEntity<Materia> put(@RequestBody Materia materia){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(materia));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
