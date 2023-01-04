package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stage1 {
    /* https://hyperskill.org/projects/184/stages/931/implement
     *
     * Project Amazing Numbers - Stage 1
     */

    // Static variables
    static String checkParity = "This number is %s.%n";
    static String errorNotNatural = "Error: Not a natural number, " +
            "zero will be used instead";
    static String getNatural = "Enter a natural number:";

    public static void main() {
        Print.subtitle("Stage 1 - Buzz Numbers", '*', (byte) 80);

        /*
        int userInput = getNatural();
        if (userInput != 0) {
            checkParity(userInput);
        }
        */

        // TEST PHASE
        int[] testValues = {11, 22, 33, 44, 49, 14, 55, 66, 77, 337, 8888};
        for (int userInput: testValues) {
            System.out.printf("Number %d:%n\t. ", userInput);
            checkParity(userInput);
            checkBuzz(userInput);
        }
        // END OF TEST PHASE

        Print.subtitle("End of Stage 1", '*', (byte) 80);
    }


    private static void checkBuzz(int userInput) {
        // Variables
        String buzzReason1 = "%d is divisible by 7%n";
        String buzzReason2 = "%d ends with 7%n";
        String buzzReason3 = "%d is divisible by 7 and ends with 7%n";
        String buzzStatus = "It is%sa Buzz number%n";
        String notBuzz = "%d is neither divisible by 7 " +
                "nor does it end with 7%n";
        String[] buzzReasons = {notBuzz, buzzReason1, buzzReason2, buzzReason3};
        int userInputStatus = 0;

        // Processing
        userInputStatus += multipleOf7(userInput);
        userInputStatus += endsBy7(userInput);
        System.out.println(userInputStatus);
        System.out.println(userInputStatus == 0 ? "not " : " ");
        System.out.printf(buzzStatus, (userInputStatus == 0 ? " not " : " "));
        System.out.printf(buzzReasons[userInputStatus], userInput);
    }


    private static void checkParity(int userInput) {
        System.out.printf(checkParity, userInput % 2 == 0 ? "Even" : "Odd");
    }


    private static int endsBy7(int userInput) {
        // This method returns 0 if userInput does not end with 7,
        // and returns 2 elsewhere;

        return (userInput % 10 == 7) ? 2 : 0;
    }


    private static int multipleOf7(int userInput) {
        // This method returns 0 if userInput is not divisible by 7,
        // and returns 1 elsewhere;
        if (userInput < 10) {
            return (userInput == 0 || userInput == 7) ? 1 : 0;
        } else {
            // Variables
            int lastDigit = userInput % 10;
            int prefix = userInput / 10;

            return multipleOf7(Math.abs(prefix - ( 2 * lastDigit)));
        }
    }
    private static int getNatural() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println(getNatural);

        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            userInput = 0;
        }

        if (userInput <= 0) {
            System.out.println(errorNotNatural);
            userInput = 0;
        }

        return userInput;
    }
}
