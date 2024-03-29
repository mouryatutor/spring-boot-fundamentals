package com.ratan.thymeleafdemo.modal;

public class Student {
    
    public String name;
    public Integer score;

    

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Student()
    {
        this.name = "";
        this.score = 0;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }


    
    
}
