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

        int userInput = getNatural(); // returns 0 if invalid input
        if (userInput != 0) {
            // TODO:
            // Check parity
            checkParity(userInput);
            // Check buzz
            // Check Duck
        }

        Print.subtitle("End of Stage 2", '*', (byte) 80);
    }


    private static void checkParity(int userInput) {
        boolean even = userInput % 2 == 0;
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
