package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Student;
import com.example.repositories.StudentRepository;

@Service
public class StudentService<T extends Student> extends PersonService<T>{
	@Autowired
	private StudentRepository<T> repo;
	
	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public StudentService(StudentRepository<T> repo) {
		super();
		this.repo = repo;
	}
//	public List<T> getAll() {
//		return repo.findAll();
//	}
//	public T getStudent(Integer id) {
//		return repo.findById(id).get();
//	}
	public Integer saveStudent(T perp) {
		if(perp.getId() != null) {
			T temp = getPerson(perp.getId());
			temp.setName(perp.getName());
			temp.setMajor(perp.getMajor());
			temp.setStudentID(perp.getStudentID());
			repo.save(temp);
			return perp.getId();
		}else {
			repo.save(perp);			
		}
		return perp.getId();
	}
}
