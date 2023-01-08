package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage4 {
    /* https://hyperskill.org/projects/184/stages/934/implement
     *
     * Amazing Numbers - Stage 4 : Gapful number
     */

    // Static Variables
    static String instructions = """
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive \
            numbers are to be printed;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;
    static String askRequest = "Enter a request:";
    static String errorNotNatural = "The first parameter should be a " +
            "natural number or zero";


    public static void main() {
        Print.subtitle("Stage 4 : Gapful Number", '*', (byte) 80);

        System.out.println(instructions);
        getUserInput();

        Print.subtitle("End of Stage 4", '*', (byte) 80);
    }


    private static long[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println(askRequest);

        userInput = scanner.next();

        return new long[2];
    }
}
