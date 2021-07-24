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
import org.vestibulandosdacidadania.Learn.repository.AulaRepository;

import org.vestibulandosdacidadania.Learn.model.Aula;

@RestController
@RequestMapping("/aula")
@CrossOrigin("*")
public class AulaController {
	
	@Autowired
	private AulaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aula>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aula> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Aula>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Aula> post(@RequestBody Aula aula){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aula));
	}
	
	@PutMapping
	public ResponseEntity<Aula> put(@RequestBody Aula aula){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aula));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
