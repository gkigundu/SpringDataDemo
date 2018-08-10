package com.example.repositories;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Person;
@Repository
@Primary
public interface PersonRepository<T extends Person> extends JpaRepository<T, Integer> {
	public List<T> findAll();
}
