package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Person;
import com.example.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController<T extends Person> {
	@Autowired
	private PersonService<T> service;
	
	
	public PersonController() {
		super();
	}
	//@Autowired
	public PersonController(PersonService<T> service) {
		super();
		this.service = service;
	}

	@GetMapping("/all")
	public ResponseEntity<List<T>> getAll(){
		return new ResponseEntity<List<T>>(service.getAll(), HttpStatus.OK);
	}
	@GetMapping("/person/{id}")
	public ResponseEntity<T> getPerson(@PathVariable Integer id){
		return new ResponseEntity<T>(service.getPerson(id), HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Integer> addPerson(@RequestBody T perp){
		return new ResponseEntity<Integer>(service.savePerson(perp), HttpStatus.ACCEPTED);
	}
}
