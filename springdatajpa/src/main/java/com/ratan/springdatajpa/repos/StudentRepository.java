package com.ratan.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratan.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

    
    
}
