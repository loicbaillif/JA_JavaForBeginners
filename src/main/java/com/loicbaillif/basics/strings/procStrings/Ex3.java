package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex3 {
    /* https://hyperskill.org/learn/step/2295
     * *** Cutting out the middle of a String ***
     * Write a program that reads a string, and then outputs the string
     * without its middle character when the length is odd, and without
     * the middle 2 characters when the length is even.
     */
    public static void main() {
        Print.title("Processing Strings - Exercise: Cutting out the middle");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int inputSize = userInput.length();

        Print.subtitle("End of exercise");
    }
}
