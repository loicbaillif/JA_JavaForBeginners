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
    static String errorInvalidProperty = """
    Error: the property [%s] is wrong.
    Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
    "ODD", "PALINDROMIC", "SPY"]
    """;
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String errorNbArgs = "Error: The program needs 1 to 3 arguments";
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
    static String[] listProperties =
            {"BUZZ", "DUCK", "EVEN", "GAPFUL", "ODD", "PALINDROMIC", "SPY"};
    static ProjectNumber projectNumber = new ProjectNumber(1);

    public static void main() {
        Print.subtitle("Stage 5 : Spy Numbers", '*', (byte) 80);

        // Variables
        boolean exitCondition = false;
        String[] userInput;

        System.out.println(instructions);

        while (!exitCondition) {
            System.out.println(askRequest);
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


    private static boolean isValidProperty(String property) {
        boolean result = false;
        for (String listProperty : listProperties) {
            if (Objects.equals(listProperty, property)) {
                result = true;
                break;
            }
        }

        if (!result) System.out.printf(errorInvalidProperty, property);

        return result;
    }


    private static boolean treat1Input(String userInput) {
        // Exit condition
        if (Objects.equals("0", userInput)) return true;

        // Variable
        long firstValue = verifyFirstValue(userInput);
        if (firstValue == -1) return false;

        projectNumber.setNumberValue(firstValue);
        projectNumber.setProperties();
        projectNumber.giveStatus(numberStatus);

        return false;
    }


    private static void treat2Inputs(String[] userInput) {
        // Check first value
        long firstValue = verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = (int) CheckInput.strToLong(
                userInput[1],
                errorLen,
                0L
        );

        // Treat request only if previous checks successful
        for (int i = 0; i < nbElements; i++) {
            projectNumber.setNumberValue(firstValue + i);
            projectNumber.setProperties();
            projectNumber.giveShortStatus();
        }
    }


    private static void treat3Inputs(String[] userInput) {
        System.out.println("3 arguments detected"); // DEBUG

        // Check first value
        long firstValue = verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = (int) CheckInput.strToLong(
                userInput[1],
                errorLen,
                0L
        );

        // Check requested property
        String seekedProperty = userInput[2].toUpperCase();
        if (!isValidProperty(seekedProperty)) return;

    }

    private static boolean treatRequest(String[] userInput) {
        // Variables
        int nbArgs = userInput.length;
        boolean endProgram = false;

        switch (nbArgs) {
            case 1 -> endProgram = treat1Input(userInput[0]);
            case 2 -> treat2Inputs(userInput);
            case 3 -> treat3Inputs(userInput);
            default -> System.out.println(errorNbArgs);
        }

        return endProgram;
    }


    private static long verifyFirstValue(String userInput) {
        return CheckInput.strToLong(
                userInput,
                errorNotNatural,
                -1L
        );
    }
}
