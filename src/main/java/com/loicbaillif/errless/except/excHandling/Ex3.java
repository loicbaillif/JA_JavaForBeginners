package com.loicbaillif.errless.except.excHandling;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Ex3 {
    /* https://hyperskill.org/learn/daily/2481
     *
     * ***** Converting and multiplying *****
     *
     * Your task is to write a program that reads a sequence of strings and
     * converts them to integer numbers, multiplying by 10. Some input strings
     * may have an invalid format, for instance: "abc". The sequence length
     * may be different. Its ending is indicated by “0”. Zero serves as a stop
     * character and should not be included in the sequence.
     *
     * If a string can be converted to an integer number, output the number
     * multiplied by 10. Otherwise, output the string "Invalid user input: X"
     * where X is the input string.
     */

    public static void main() {
        Print.title("Exception Handling - Exercise: String to double");

        Scanner scanner = new Scanner(System.in);
        int nbInputs = 0;

        while (treatInput(scanner.next())) {
            nbInputs++;
        }


        Print.subtitle("End of exercise", '+', (byte) 80);
    }

    private static boolean treatInput(String userInput) {
        if (Objects.equals("0", userInput)) return false;

        System.out.printf("\t%s0%n", userInput);

        return true;
    }
}
