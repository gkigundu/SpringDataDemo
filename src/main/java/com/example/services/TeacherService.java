package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Teacher;
import com.example.repositories.TeacherRepository;
@Service
public class TeacherService {
	@Autowired
	private TeacherRepository repo;
	
	public TeacherService() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public TeacherService(TeacherRepository repo) {
		super();
		this.repo = repo;
	}
	public List<Teacher> getAll() {
		return repo.findAll();
	}
	public Teacher getTeacher(Integer id) {
		return repo.findById(id).get();
	}
	public Integer saveTeacher(Teacher perp) {
		repo.save(perp);
		return perp.getId();
	}
}
