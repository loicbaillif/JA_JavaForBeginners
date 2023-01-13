package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

import java.util.Objects;
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
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";


    public static void main() {
        Print.subtitle("Stage 4 : Gapful Number", '*', (byte) 80);

        System.out.println(instructions);
        long[] userInput = getUserInput();

        // Debug
        for (int i = 0; i < userInput.length; i++) {
            System.out.printf("input %d = %d%n", i, userInput[i]);
        }
        // End of debug

        Print.subtitle("End of Stage 4", '*', (byte) 80);
    }


    private static long[] convertUserInput(String inputString) {
        // gets user input as String and returns it as long[]
        long firstNumber = CheckInput.strToLong(
                inputString.split(" ")[0], errorNotNatural, 0L
        );
        long qtyNumbers = 1L;

        if (inputString.indexOf(' ') != -1) {
            // Two inputs
            qtyNumbers = CheckInput.strToLong(
                    inputString.split(" ")[1], errorLen, 0L
            );
        }

        long[] userInput;
        if (
            (firstNumber != -1) &&
            (qtyNumbers != -1) &&
            (qtyNumbers <= Integer.MAX_VALUE)
            ) {
            userInput = new long[(int) qtyNumbers];
            for (int i = 0; i < qtyNumbers; i++) {
                userInput[i] = firstNumber++;
            }
        } else {
            userInput = new long[]{-1};
        }
        return userInput;
    }


    private static long[] getUserInput() {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String inputString;
        long[] userInput = new long[0];
        System.out.println(userInput.length);

        System.out.println(askRequest);

        inputString = scanner.nextLine();

        if (Objects.equals("", inputString)) {
            System.out.println(instructions);
        } else {
            // String not empty
            userInput = convertUserInput(inputString);
        }

        return userInput;
    }
}
