package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Objects;
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

        // Variables
        boolean exitCondition = false;

        System.out.println(instructions);
        String[] userInput;
        while (!exitCondition) {
            userInput = getUserInput();
            exitCondition = treatRequest(userInput);
        }


        Print.subtitle("End of Stage 5", '*', (byte) 80);
    }


    private static String[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().split(" ");
    }


    private static boolean treat1Input(String userInput) {
        System.out.println("1 argument detected"); // DEBUG
        if (Objects.equals("0", userInput)) {
            return true;
        }

        return false;
    }


    private static boolean treatRequest(String[] userInput) {
        // Variables
        int nbArgs = userInput.length;
        boolean endProgram = false;

        switch (nbArgs) {
            case 1 -> endProgram = treat1Input(userInput[0]);
            case 2 -> System.out.println("2 arguments detected");
            case 3 -> System.out.println("3 arguments detected");
            default -> System.out.println("Invalid number of arguments");
        }

        return endProgram;
    }
}
