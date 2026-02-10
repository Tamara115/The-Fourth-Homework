package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class GradeStats {

    private final ArrayList<Double> grades = new ArrayList<>();

// Constructor
    public GradeStats() {
        grades.add(60.0);
        grades.add(120.0);
        grades.add(78.5);
        grades.add(94.0);
    }

// checking grade range
    public void gradeGenerator(double grade) {
        if (grade < 0 || grade> 100) {
            System.out.println("Not in a range: " + grade);
            return;
        }
        grades.add(grade);
    }

    public double calculateMaxGrade() {
        return Collections.max(grades);

    }

    public double calculateMinGrade() {
        return Collections.min(grades);
    }

    public double calculateAvgGrade() {
        int sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void printStats() {
        if (grades.isEmpty()) {
            System.out.println("No grades");
            return;
        }

        System.out.println("Average: " +calculateAvgGrade());
        System.out.println("Maximum: "+calculateMaxGrade());
        System.out.println("Minimum: "+calculateMinGrade());
    }

}


