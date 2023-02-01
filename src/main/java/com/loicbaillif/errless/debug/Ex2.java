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
        System.out.println(capitalize(ex1));
        System.out.println(capitalize(ex2));
        System.out.println(capitalize(ex3));
        System.out.println(capitalize(ex4));


        Print.title(("End of exercise"));
    }


    public static String capitalize(String str) {
        System.out.printf("Before: %s%n", str); // LOG
        if (str == null || str.isBlank()) {
            System.out.printf("After: %s%n", str);
            return str;
        }

        if (str.length() == 1) {
            return str.toUpperCase();
        }

        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
