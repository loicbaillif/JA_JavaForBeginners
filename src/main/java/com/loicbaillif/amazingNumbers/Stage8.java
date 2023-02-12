package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage8 {
    /* https://hyperskill.org/projects/184/stages/938/implement
     *
     * Stage 8 : Happy and Sad numbers
     */

    // Variables
    static String askRequest = "Enter a request:";
    static String errorEmpty = "Error: User input cannot be empty.";
    static String farewell = "Thanks for using Amazing Numbers, goodbye!";
    static String instructions = """
            Welcome to Amazing Numbers!
                        
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive numbers are to be printed;
            - two natural numbers and properties to search for;
            - a property preceded by minus must not be present in numbers;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;

    public static void main() {
        Print.subtitle("Stage 8: Happy and Sad numbers", '*', (byte) 80);

        // Variables
        boolean exitCondition = false;
        String[] userInput;

        // Welcome user
        System.out.println(instructions);

        while (!exitCondition) {
            System.out.println(askRequest);
            userInput = getUserInput();
            exitCondition = treatRequest(userInput);
        }

        // Farewell user
        System.out.println(farewell);

        Print.subtitle("End of Stage 8", '*', (byte) 80);
    }


    static String[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        while (userInput.length() == 0) {
            System.out.println(errorEmpty);
            userInput = scanner.nextLine();
        }

        return userInput.split(" ");
    }


    private static boolean treatRequest(String[] userInput) {
        // Variables
        int nbArgs = userInput.length;
        boolean endProgram = false;

        if (nbArgs == 0) return false;

        switch (nbArgs) {
            case 1 -> endProgram = ProcessRequests.process1Input(userInput[0]);
            case 2 -> ProcessRequests.process2Inputs(userInput);
            default -> ProcessRequests.process3MoreInputs(userInput);
        }

        return endProgram;
    }
}
