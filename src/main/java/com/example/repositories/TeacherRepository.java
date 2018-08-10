package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
