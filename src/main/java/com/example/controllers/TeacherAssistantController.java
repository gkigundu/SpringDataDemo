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

import com.example.beans.TeacherAssistant;
import com.example.services.TeacherAssistantService;
@RestController
@RequestMapping("/ta")
public class TeacherAssistantController {
	@Autowired
	private TeacherAssistantService service;
	
	public TeacherAssistantController() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public TeacherAssistantController(TeacherAssistantService service) {
		super();
		this.service = service;
	}
	@GetMapping("/all")
	public ResponseEntity<List<TeacherAssistant>> getAll(){
		return new ResponseEntity<List<TeacherAssistant>>(service.getAll(), HttpStatus.OK);
	}
	@GetMapping("/ta/{id}")
	public ResponseEntity<TeacherAssistant> getTeacher(@PathVariable Integer id){
		return new ResponseEntity<TeacherAssistant>(service.getTeacherAssistant(id), HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Integer> addTeacher(@RequestBody TeacherAssistant perp){
		return new ResponseEntity<Integer>(service.saveTeacherAssistant(perp), HttpStatus.ACCEPTED);
	}
}
