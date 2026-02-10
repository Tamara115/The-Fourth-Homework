package org.example;

import net.datafaker.Faker;

public class Student {

    private String name;
    private double score;

    // constructor
    public  Student() {
        Faker faker = new Faker();
        this.name = faker.name().fullName();
        this.score = faker.number().numberBetween(0.0, 100.0);
    }

    public double getScore(){
        return score;
    }


    public void printStudents() {
        System.out.println("Name :" + name);
        System.out.println("Score: " + score);

    }

}
