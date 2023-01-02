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

        int userInput = getNatural();
        if (userInput != 0) {
            checkParity(userInput);
        }

        Print.subtitle("End of Stage 1", '*', (byte) 80);
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
