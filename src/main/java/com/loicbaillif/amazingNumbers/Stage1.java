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
        int[] testValues = {11, 22, 33, 44, 55, 66, 777, 8888};
        for (int userInput: testValues) {
            System.out.printf("Number %d:%n\t. ", userInput);
            checkParity(userInput);
        }
        // END OF TEST PHASE

        Print.subtitle("End of Stage 1", '*', (byte) 80);
    }


    private static void checkBuzz(int userInput) {

    }


    private static void checkParity(int userInput) {
        System.out.printf(checkParity, userInput % 2 == 0 ? "Even" : "Odd");
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
