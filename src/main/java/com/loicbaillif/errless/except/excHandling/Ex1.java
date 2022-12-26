package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

public class Ex1 {
    public static void main() {
        /* https://hyperskill.org/learn/step/2478
         *
         * ***** String to double conversion *****
         *
         * Consider a method that takes a string and converts it to a double.
         * If the input string happens to be null or of an unsuitable format,
         * a runtime exception occurs and the program fails.
         *
         * Fix the method, so it would catch any exception and return the
         * default value 0 (zero) if an exception occurred.
         */
        Print.title("Exception Handling - Exercise: String to double");

        double d1 = convertStringToDouble("123");
        System.out.println(d1 / 10);

        Print.subtitle("End of exercise", '+', (byte) 80);
    }


    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
