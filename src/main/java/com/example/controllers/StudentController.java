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

import com.example.beans.Student;
import com.example.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController<T extends Student> {
	@Autowired
	private StudentService<T> service;
	
	public StudentController() {
		super();
	}
	//@Autowired
	public StudentController(StudentService<T> service) {
		super();
		this.service = service;
	}
	@GetMapping("/all")
	public ResponseEntity<List<T>> getAll(){
		return new ResponseEntity<List<T>>(service.getAll(), HttpStatus.OK);
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id){
		return new ResponseEntity<Student>(service.getPerson(id), HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Integer> addStudent(@RequestBody T perp){
		return new ResponseEntity<Integer>(service.saveStudent(perp), HttpStatus.ACCEPTED);
	}
}
