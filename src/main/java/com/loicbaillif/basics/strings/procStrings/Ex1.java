package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex1 {
    /* https://hyperskill.org/learn/step/2294
     *
     * Write a program that reads a string and then
     * output another string with doubled characters.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: Double characters");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            System.out.printf("%c%c",
                    userInput.charAt(i), userInput.charAt(i));
        }

        Print.subtitle("End of exercise");
    }
}
