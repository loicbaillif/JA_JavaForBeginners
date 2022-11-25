package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex9 {
    /* https://hyperskill.org/learn/step/2296
     *
     * *** Convert a date ***
     * Write a program that takes a date string formatted as YYYY-MM-DD
     * as input, then converts and outputs it as MM/DD/YYYY.
     *
     * For instance, the input 2007-07-21 will result in the following
     * output 07/21/2007.
     */
    public static void main() {
        Print.title("Processing Strings - Exercise: Convert a date");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.printf(
                "%s/%s/%s",
                userInput.substring(5, 7),
                userInput.substring(8),
                userInput.substring(0, 4)
        );


        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
