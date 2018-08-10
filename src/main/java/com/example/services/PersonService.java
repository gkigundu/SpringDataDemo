package com.example.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.beans.Person;
import com.example.repositories.PersonRepository;

@Service
@Primary
public class PersonService<T extends Person> {
	@Autowired
	private PersonRepository<T> repo;
	
	public PersonService() {
		super();
	}
	//@Autowired
	public PersonService(PersonRepository<T> repo) {
		super();
		this.repo = repo;
	}
	public List<T> getAll() {
		return repo.findAll();
	}
	public T getPerson(Integer id) {
		return repo.findById(id).get();
	}
	@Transactional(rollbackOn = Exception.class)
	public Integer savePerson(T perp) {
		if(perp.getId() != null) {
			T temp = getPerson(perp.getId());
			temp.setName(perp.getName());
			repo.save(temp);
			return perp.getId();
		}else {
			repo.save(perp);			
		}
		return perp.getId();
	}
}
