package com.loicbaillif.errless.debug;

import com.loicbaillif.tools.Print;

public class Ex2 {
    // https://hyperskill.org/learn/daily/13776
    // Exercise: Log Events

    public static void main() {
        Print.title(("Exercise - Log Events"));

        String ex1 = "string";
        String ex2 = "Capitalized";
        String ex3 = "";
        String ex4 = "g";
        String temp = capitalize(ex1);
        temp = capitalize(ex2);
        temp = capitalize(ex3);
        temp = capitalize(ex4);


        Print.title(("End of exercise"));
    }


    public static String capitalize(String str) {
        System.out.printf("Before: %s%n", str); // LOG
        if (str == null || str.isBlank()) {
            System.out.printf("After: %s%n", str); // LOG
            return str;
        }

        if (str.length() == 1) {
            System.out.printf("After: %s%n", str.toUpperCase()); // LOG
            return str.toUpperCase();
        }

        System.out.printf("After: %c%s%n",
                Character.toUpperCase(str.charAt(0)),
                str.substring(1)); // LOG
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
