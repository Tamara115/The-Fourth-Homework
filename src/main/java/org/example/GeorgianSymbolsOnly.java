package org.example;

public class GeorgianSymbolsOnly {
    private final String text;

// Constructor
    public GeorgianSymbolsOnly(){
        this.text ="mმხოლოდ ქართული7 sსიმბffოლოები";
    }

    public static String removeNonGeorgianChars(String input){
        return input.replaceAll("[^ა-ჰ ]", "");
    }

    public void printInfo(){
        System.out.println("Original :" +text);
        System.out.println("Modified: " +removeNonGeorgianChars(text));

    }

}
