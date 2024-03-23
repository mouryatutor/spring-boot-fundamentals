package com.assignment.student.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.student.entities.Student;
import com.assignment.student.repos.StudentRepo;

@RestController
public class StudentController {
    
    // CRUD functions for students
    private StudentRepo repository;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id){
        repository.deleteById(id);
    }





    



    
}
