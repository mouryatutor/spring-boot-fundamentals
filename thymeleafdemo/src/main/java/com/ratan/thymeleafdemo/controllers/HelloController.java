package com.ratan.thymeleafdemo.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ratan.thymeleafdemo.modal.Student;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @RequestMapping("sendData")
    public ModelAndView sendData() {
        ModelAndView mav = new ModelAndView("data");
        mav.addObject("message", "Take up one idea and make it your life");
        return mav;
    }

    @RequestMapping("/student")
    public ModelAndView getStudent()
    {
        ModelAndView mav = new ModelAndView("student");
        Student student = new Student("Ratan Mourya",100);
        mav.addObject("student", student);
        return mav;
        
    }


    @RequestMapping("/students")
    public ModelAndView getStudents()
    {
        ModelAndView mav = new ModelAndView("studentList");
        Student student1 = new Student("Ratan Mourya",100);
        Student student2 = new Student("Devendra Mourya", 200);
        mav.addObject("students", Arrays.asList(student1,student2));
        return mav;
        
    }
    
}
