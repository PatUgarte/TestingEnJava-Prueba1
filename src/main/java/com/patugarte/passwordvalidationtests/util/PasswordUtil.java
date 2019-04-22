package com.patugarte.passwordvalidationtests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z]+")){  //Ahí estoy indicando con una expresión regular que el password está formado por letras minúsculas de la a-z y/o letras mayúsclas de la A-Z y que pueden repetirse las letras.
            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z10-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
