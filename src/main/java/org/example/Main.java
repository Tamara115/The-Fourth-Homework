package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // Task 1 -SchoolSchedule class -printing list of lessons for the day.
        SchoolSchedule schedule =new SchoolSchedule();
        schedule.printScheduleForDay("Monday");
        System.out.println("-------------------------------");


        // Task 2 -GeorgianNameGenerator class -returning randomly Georgian name and surname
        GeorgianNameGenerator.printNames();
        System.out.println("-------------------------------");


        // Task 3 -GradeStats class -returning  min, max and avg of student's grades
        GradeStats scores =new GradeStats();
        scores.printStats();
        System.out.println("-------------------------------");

        // Task 4 -EmailValidator class -checking if email contains "@" and "_" symbols in the correct order
        EmailValidator validator =new EmailValidator();
        System.out.println("Email Validation: " + validator.isValid("checkemail.@com_"));
        System.out.println("-------------------------------");


        // Task 5 -remove all non-Georgian symbols from string
        GeorgianSymbolsOnly result =new GeorgianSymbolsOnly();
        result.printInfo();
        System.out.println("-------------------------------");

        /*
        Task 6 -TestDataFromFile class -reading names from .txt file and printing
        only those that are starting with vowels
         */
       TestDataFromFile.printNamesWithVowels();
       System.out.println("-------------------------------");

        /*
        Task 7 - StudentSorter class - receives List<Student> object and sort students by score descending order.
        Student class with fields: name, score
         */
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        StudentSorter sorted = new StudentSorter(students);
        sorted.printInfo();




    }
}