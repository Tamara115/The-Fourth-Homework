package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestDataFromFile {

// reading names from .txt file
    private static List<String> readNames() {

        try {
            return Files.readAllLines(Paths.get("names.txt"));
        } catch (IOException e) {
            System.out.println("loading error " + e.getMessage());
        }
        return List.of();
    }

    // check on vowels
    public static boolean namesWithVowels(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char letter = name.charAt(0);
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';

    }

    public static void printNamesWithVowels( ){
        List<String> names =readNames();

        for (String name : names) {
            if (namesWithVowels(name)) {
                System.out.println("Name: "+ name);
            }
        }
    }

}

