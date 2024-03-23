package com.assignment.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.student.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
