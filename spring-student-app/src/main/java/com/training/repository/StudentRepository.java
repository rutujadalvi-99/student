package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
