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

import com.example.beans.Teacher;
import com.example.services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService service;
	
	public TeacherController() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public TeacherController(TeacherService service) {
		super();
		this.service = service;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Teacher>> getAll(){
		return new ResponseEntity<List<Teacher>>(service.getAll(), HttpStatus.OK);
	}
	@GetMapping("/teacher/{id}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable Integer id){
		return new ResponseEntity<Teacher>(service.getTeacher(id), HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Integer> addTeacher(@RequestBody Teacher perp){
		return new ResponseEntity<Integer>(service.saveTeacher(perp), HttpStatus.ACCEPTED);
	}
}
