package com.company.student;

import com.company.company.Person;

public class Student extends Person {


    // Define features of a student
    private int score;

    // Define a constructor
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    // Define getters and setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
