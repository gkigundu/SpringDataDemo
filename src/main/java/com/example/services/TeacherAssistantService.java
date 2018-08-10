package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.TeacherAssistant;
import com.example.repositories.TeacherAssistantRepository;


@Service
public class TeacherAssistantService {
	@Autowired
	private TeacherAssistantRepository repo;
	
	public TeacherAssistantService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public TeacherAssistantService(TeacherAssistantRepository repo) {
		super();
		this.repo = repo;
	}
	public List<TeacherAssistant> getAll() {
		return repo.findAll();
	}
	public TeacherAssistant getTeacherAssistant(Integer id) {
		return repo.findById(id).get();
	}
	public Integer saveTeacherAssistant(TeacherAssistant perp) {
		repo.save(perp);
		return perp.getId();
	}
}
