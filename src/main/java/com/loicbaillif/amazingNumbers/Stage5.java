package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage5 {
    /* https://hyperskill.org/projects/184/stages/935/implement
     *
     * Stage 5 - Spy Numbers
     */

    // Static Variables
    static String instructions = """
            Welcome to Amazing Numbers!
            
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive \
            numbers are to be printed;
            - two naturals numbers and a property to search for;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;
    static String askRequest = "Enter a request:";
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String farewell = "Thanks for using Amazing Numbers, goodbye!";
    static String numberStatus = """
            Properties of %d
                       even: %b
                        odd: %b
                       buzz: %b
                       duck: %b
                palindromic: %b
                     gapful: %b
                        spy: %b
            """;

    public static void main() {
        Print.subtitle("Stage 5 : Spy Numbers", '*', (byte) 80);

        System.out.println(instructions);
        String[] userInput = getUserInput();

        Print.subtitle("End of Stage 5", '*', (byte) 80);
    }


    private static String[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String[] userInput = {"", "", ""};

        return userInput;
    }
}
