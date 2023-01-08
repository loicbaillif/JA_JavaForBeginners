package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stage3 {
    /* https://hyperskill.org/projects/184/stages/933/implement
     *
     * Stage 3 - Palindromic Numbers
     */

    // Static variables

    static String welcome = """
            Welcome to Amazing Numbers!
                
            Supported requests:
                - enter a natural number to know its properties;
                - enter 0 to exit.
            """;
    static String numberStatus = """
            Properties of %d
                       even: %b
                        odd: %b
                       buzz: %b
                       duck: %b
                palindromic: %b
            """;
    static String errorNotNatural = "The first parameter should be a " +
            "natural number or zero";


    public static void main() {
        Print.subtitle("Stage 3 - Palindromic Numbers", '*', (byte) 80);

        System.out.println(welcome);
        ProjectNumber projectNumber = new ProjectNumber(getNatural());

        /* TEST PHASE
        long[] testValues = {11L, 234L, 31L, 400L, 56L, 71L, 787L, 6789L, 66L,
                9223372036854775807L};
        for (long testValue : testValues) {
            projectNumber.setNumberValue(testValue);
            System.out.printf(numberStatus,
                    projectNumber.getNumberValue(),
                    projectNumber.isEven(),
                    projectNumber.isOdd(),
                    projectNumber.isBuzz(),
                    projectNumber.isDuck(),
                    projectNumber.isPalindromic());
        }
        // END TEST */

        while (projectNumber.getNumberValue() != 0) {
            if (projectNumber.getNumberValue() != -1) {
                System.out.printf(numberStatus,
                        projectNumber.getNumberValue(),
                        projectNumber.isEven(),
                        projectNumber.isOdd(),
                        projectNumber.isBuzz(),
                        projectNumber.isDuck(),
                        projectNumber.isPalindromic());
            }
            projectNumber.setNumberValue(getNatural());
        }


        Print.subtitle("End of Stage 3", '*', (byte) 80);
    }


    private static long getNatural() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        long userInput;

        try {
            userInput = scanner.nextLong();
        } catch (InputMismatchException e) {
            userInput = -1L;
        }

        if (userInput < 0) {
            System.out.println(errorNotNatural);
            userInput = -1L;
        }

        return userInput;
    }
}
