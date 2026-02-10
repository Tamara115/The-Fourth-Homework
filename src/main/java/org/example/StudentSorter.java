package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentSorter {
    private List<Student> students;

// Constructor
    public StudentSorter(List<Student> students){
        this.students =students;
    }

// printing scores by descending order by using Comparator
    public  void  printInfo(){
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Double.compare(b.getScore(), a.getScore());
            }
        });
//        students.sort((o1, o2) -> Double.compare(o2.getScore(), o1.getScore())); -InteliJ offered this lambdas

        for (Student student : students) {
            student.printStudents();
        }


    }

}
