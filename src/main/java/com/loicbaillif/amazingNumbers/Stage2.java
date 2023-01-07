package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stage2 {
    /* https://hyperskill.org/projects/184/stages/932/implement
     *
     * Project Amazing Numbers - Stage 2
     */

    // Static Variables
    static String errorNotNatural = "Error: This is not a natural number";
    static String getNatural = "Enter a natural number:";
    static String statusEven = "\teven: %b%n";
    static String statusOdd = "\t odd: %b%n";


    public static void main() {
        Print.subtitle("Stage 2 - Duck Numbers", '*', (byte) 80);

        // TEST PHASE
        int[] testValues = {11, 22, 33, 44, 49, 14, 55, 66, 77, 337, 8888};
        for (int userInput: testValues) {
            System.out.printf("%nNumber %d:%n", userInput);
            checkParity(userInput);
            checkBuzz(userInput);
        }
        // END OF TEST PHASE


        /*
        int userInput = getNatural(); // returns 0 if invalid input
        if (userInput != 0) {
            // TODO:
            // Check parity
            checkParity(userInput);
            // Check buzz
            // Check Duck
        }
         */

        Print.subtitle("End of Stage 2", '*', (byte) 80);
    }


    private static void checkBuzz(int userInput) {
        // Variables
        boolean buzzStatus;

        // Processing
        buzzStatus = endsBy7(userInput);
    }


    private static void checkParity(int userInput) {
        boolean even = userInput % 2 == 0;
        System.out.printf(statusEven, even);
        System.out.printf(statusOdd, !even);
    }


    private static boolean endsBy7(int userInput) {
        // This method returns false if userInput does not end with 7,
        // and returns true elsewhere;

        return (userInput % 10 == 7);
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


    private static boolean multipleOf7(int userInput) {
        // This method returns false if userInput is not divisible by 7,
        // and returns true elsewhere;
        if (userInput < 10) {
            return (userInput == 0 || userInput == 7);
        } else {
            // Variables
            int lastDigit = userInput % 10;
            int prefix = userInput / 10;

            return multipleOf7(Math.abs(prefix - ( 2 * lastDigit)));
        }
    }
}
