package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeorgianNameGenerator {

    public static String getRandomName(){

        List<String> names =new ArrayList<>();

        names.add ("Gvantsa Khonelidze");
        names.add("Ketevan Tughushi");
        names.add("Tamar Chikhladze");
        names.add("Giorgi Markarashvili");
        names.add("Davit Khubua");
        names.add("Nikoloz Machavariani");
        names.add("Lika Abashidze");
        names.add("Maka Metreveli");
        names.add("Mariam Lortkipanidze");
        names.add("Irakli Tabagari");

        Collections.shuffle(names);
        return names.get(0);


    }

    public static void printNames(){
        System.out.println("Full Name: " + GeorgianNameGenerator.getRandomName());

    }

}
