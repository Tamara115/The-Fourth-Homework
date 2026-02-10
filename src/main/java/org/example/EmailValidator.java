package org.example;

public class EmailValidator {

    public boolean isValid(String email) {

        int atSymbol = email.indexOf("@");
        int underscoreSymbol = email.indexOf("_");


        if (atSymbol == -1 || atSymbol == email.length()-1 || underscoreSymbol > atSymbol) {
            return false;
        } else {
            return true;
        }


    }

}
