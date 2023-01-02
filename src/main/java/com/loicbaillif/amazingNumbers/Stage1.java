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
    static String errorNotNatural = "Error: Not a natural number, " +
            "zero will be used instead";
    static String getNatural = "Enter a natural number:";

    public static void main() {
        Print.subtitle("Stage 1 - Buzz Numbers", '*', (byte) 80);

        int userInput = getNatural();
        System.out.println(userInput);

        Print.subtitle("End of Stage 1", '*', (byte) 80);
    }

    private static int getNatural() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNatural);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(errorNotNatural);
            return 0;
        }
    }
}
