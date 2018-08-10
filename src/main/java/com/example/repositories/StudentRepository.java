package com.example.repositories;

import org.springframework.stereotype.Repository;

import com.example.beans.Student;
@Repository
public interface StudentRepository<T extends Student> extends PersonRepository<T> {

}
