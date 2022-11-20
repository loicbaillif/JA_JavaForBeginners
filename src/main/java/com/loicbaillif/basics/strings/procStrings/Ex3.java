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
        int inputMaxIndex = userInput.length() - 1;
        int firstDeletion = inputMaxIndex / 2;
        int secondDeletion = inputMaxIndex / 2 + inputMaxIndex % 2;
        System.out.printf("maxIndex = %d, firstDel = %d; secondDel = %d%n",
                inputMaxIndex,
                firstDeletion,
                secondDeletion);
        for (int i = 0; i < userInput.length(); i++) {
            if (i != firstDeletion && i != secondDeletion) {
                System.out.print(userInput.charAt(i));
            }
        }

        Print.subtitle("End of exercise");
    }
}
