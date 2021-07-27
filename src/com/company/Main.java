package com.company;

import com.company.student.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Shortcut for getters and setters is: alt + insert.
// Create a class called Person. They should have: // The person class will be the parent class
// - name, age.
// Create a class called Employee. This class should inherit // The Employee class will be the child class.
// the Person class. and should have the extra field of
// - company id, company name.
// Create a class called Company. This class should take in employees as
// an array attribute, name.
//
// In your main method, Populate a company's employees attribute and
// find the average age of the employees.
/*
        List<Employee> googleEmployees = new LinkedList<>();
        String goog = "Google";
        String micro = "Microsoft";

        googleEmployees.add(new Employee("Darby", 33, "JUI", goog));
        googleEmployees.add(new Employee("Arthur", 22, "POI", goog));
        googleEmployees.add(new Employee("Henrietta", 32, "DED", goog));


        List<Employee> microsoftEmployees = new LinkedList<>();
        microsoftEmployees.add(new Employee("Yeshua", 31, "432", micro));
        microsoftEmployees.add(new Employee("Josh", 28, "321", micro));
        microsoftEmployees.add(new Employee("Linda", 24, "213", micro));

        Company microsoft = new Company(microsoftEmployees, micro);
        Company google = new Company(googleEmployees, goog);

        System.out.println("The average age of employees in microsoft is: " + microsoft.getAverageAge());
        System.out.println("The average age of employees in google is: " + google.getAverageAge());*/

        // create a program that will hold 20 students scores, in an arraylist,
        // and return the maximum score in the arrayList

        // Hard-coding
        List<Student> studentList = new ArrayList<>();
        /*studentList.add(new Student("Dave", 19, 40));
        studentList.add(new Student("Josh", 19, 43));
        studentList.add(new Student("Barry", 19,  55));
        studentList.add(new Student("Dave", 19, 33));
        studentList.add(new Student("Dave", 19, 22));
        studentList.add(new Student("Dave", 19, 49));
        studentList.add(new Student("Dave", 19, 29));
        studentList.add(new Student("Dave", 19, 33));
        studentList.add(new Student("Dave", 19, 21));
        studentList.add(new Student("Dave", 19, 22));
        studentList.add(new Student("Dave", 19, 56));
        studentList.add(new Student("Dave", 19, 34));
        studentList.add(new Student("Dave", 19, 12));
        studentList.add(new Student("Dave", 19, 23));
        studentList.add(new Student("Dave", 19, 22));
        studentList.add(new Student("Dave", 19, 54));
        studentList.add(new Student("Dave", 19, 56));
        studentList.add(new Student("Dave", 19, 23));
        studentList.add(new Student("Dave", 19, 34));
        studentList.add(new Student("Dave", 19, 44));*/

        // User-interactive
        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to find out how many students they want to add.
        System.out.print("How many students do you want to add?: ");
        int numberOfStudents = scanner.nextInt();

        // populate the studentList with user-input
        for (int i = 0; i < numberOfStudents; i++) {
            // Prompt the user for data
            System.out.print("Enter the name of the student: ");
            String name = scanner.next();

            System.out.print("Enter the age of the student: ");
            int age = scanner.nextInt();

            System.out.print("Enter the score of the student: ");
            int score = scanner.nextInt();

            System.out.println();

            // Add new student object to the student list.
            studentList.add(new Student(name, age, score));
        }

//        System.out.println(studentList.size());

        Student bestStudent = getMaximumScore(studentList);

        System.out.println("The maximum score of the students is: "
                + bestStudent.getScore()
                + " belonging to " + bestStudent.getName());
    }

    public static Student getMaximumScore(List<Student> students) {
        // Define a max variable to hold the maximum value
        // assign the first element of the list to the max variable
        // in order to compare it with subsequent values and ensure that the value
        // from the object in question(array, list, etc) is actually obtained.

        Student bestStudent = students.get(0); // This is the first student in the list.
        // Not the first score in the list.

        for (Student student : students) {
            if (bestStudent.getScore() < student.getScore()) {
                bestStudent = student;
            }
        } // maximum score found by the time the loop ends.

        return bestStudent;
    }

    // public class Bardy extends Car

    // Assuming we had a car brand, called Bardy.
    // Create an object of this class, and make it extend another class called Car.
    // class Car features include: noOfTires, color.
    // Create another class called Person.
    // Features of person include: name, age, likeBardy, hasBardy, bardiesOwned(ArrayList)

    // In the main method, create a list that will contain a number of people.
    // And if a person likes bardy and does not have bardy, then give them a Bardy.
}
