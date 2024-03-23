package com.ratan.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ratan.springdatajpa.entities.Student;
import com.ratan.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	@Test
	public void testSaveStudent() {
		
		Student student = new Student();
		student.setId(1l);
		student.setName("Ratan");
		student.setTestScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1l).get();

		assertNotNull(savedStudent);
		// assertEquals(, savedStudent);

	}

}
