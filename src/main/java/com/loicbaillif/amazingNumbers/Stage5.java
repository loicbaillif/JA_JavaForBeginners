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
    static String errorEmpty = "Error: User input cannot be empty.";
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
    static ProjectNumber projectNumber = new ProjectNumber(1);

    public static void main() {
        Print.subtitle("Stage 5 : Spy Numbers", '*', (byte) 80);

        // Variables
        boolean exitCondition = false;
        String[] userInput;

        System.out.println(instructions);

        while (!exitCondition) {
            userInput = getUserInput();
            exitCondition = treatRequest(userInput);
        }

        System.out.println(farewell);

        Print.subtitle("End of Stage 5", '*', (byte) 80);
    }


    private static String[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (userInput.length() == 0) {
            System.out.println(errorEmpty);
            userInput = scanner.nextLine();
        }

        return userInput.split(" ");
    }


    private static boolean treat1Input(String userInput) {
        if (Objects.equals("0", userInput)) return true;

        try {
            long userInputLong = Long.parseLong(userInput);
            projectNumber.setNumberValue(userInputLong);
            projectNumber.setProperties();
            projectNumber.giveStatus(numberStatus);
        } catch (NumberFormatException e) {
            System.out.println(errorNotNatural);
        }

        return false;
    }


    private static void treat2Inputs(String[] userInput) {
        System.out.println("2 inputs detected");

        long firstValue = Long.parseLong(userInput[0]);
        int nbElements = Integer.parseInt(userInput[1]);
        for (int i = 0; i < nbElements; i++) {
            projectNumber.setNumberValue(firstValue + i);
            projectNumber.setProperties();
            projectNumber.giveShortStatus();
        }
    }


    private static boolean treatRequest(String[] userInput) {
        // Variables
        int nbArgs = userInput.length;
        boolean endProgram = false;

        switch (nbArgs) {
            case 1 -> endProgram = treat1Input(userInput[0]);
            case 2 -> treat2Inputs(userInput);
            case 3 -> System.out.println("3 arguments detected");
            default -> System.out.println("Invalid number of arguments");
        }

        return endProgram;
    }
}
